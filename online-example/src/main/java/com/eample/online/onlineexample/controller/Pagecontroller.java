package com.eample.online.onlineexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eample.shopbackend.dao.CategoryDao;
import com.eample.shopbackend.dto.Category;

@Controller
public class Pagecontroller {

	
		@Autowired
		private CategoryDao category;
		
		@RequestMapping(value = {"/","/home","/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","home");
			mv.addObject("category",category.list());
			mv.addObject("userClickhome","true");
			return mv;
		}
		
		/*@RequestMapping(value="/test/{greeting}")
		public ModelAndView test(@PathVariable("greeting")String greeting){
			if (greeting == null){
				greeting = "Helloo";
			}
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting",greeting);
			return mv;	
		}*/
		@RequestMapping(value="/about")
		public ModelAndView aboutus(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","about");
			mv.addObject("userClickabout","true");
			return mv;
		}
		@RequestMapping(value="/contact")
		public ModelAndView contact(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","contact");
			mv.addObject("userClickcontact","true");
			return mv;
		}
		@RequestMapping(value="/showallproducts")
		public ModelAndView show(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("title","showprodcuts");
			mv.addObject("userClickshow","true");
			mv.addObject("category",category.list());
			return mv;
		
			
		}
		
		
		@RequestMapping(value="/show/products/{id}/product")
		public ModelAndView showsingle(@PathVariable("id")int id){
			
			ModelAndView mv = new ModelAndView("page");
			Category cat=null;
			cat=category.getid(id);
			
			//ModelAndView mv = new ModelAndView("page");
			mv.addObject("title",cat.getName());
			mv.addObject("userClickproduct","true");
			mv.addObject("category1",cat);
			mv.addObject("category",category.list());
			return mv;
		
			
		}
}

