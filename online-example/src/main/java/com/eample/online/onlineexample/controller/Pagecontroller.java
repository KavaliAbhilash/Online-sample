package com.eample.online.onlineexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Pagecontroller {

		@RequestMapping(value = {"/","/home","/index"})
		public ModelAndView index(){
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting","wlecome to");
			return mv;
		}
		
		@RequestMapping(value="/test/{greeting}")
		public ModelAndView test(@PathVariable("greeting")String greeting){
			if (greeting == null){
				greeting = "Helloo";
			}
			
			ModelAndView mv = new ModelAndView("page");
			mv.addObject("greeting",greeting);
			return mv;	
		}
		}

