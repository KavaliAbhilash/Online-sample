package com.eample.online.onlineexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.eample.shopbackend.dao.CategoryDao;
import com.eample.shopbackend.dto.Category;
import com.eample.shopbackend.dto.Product;

@Controller
@RequestMapping("/manage")
public class ManagementController {

	@Autowired
	private CategoryDao categoryDao;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView management() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickManageProducts", true);
		mv.addObject("title", "ManageProducts");
		Product nproduct = new Product();
		nproduct.setSupplierId(1);
		nproduct.setActive(true);
		mv.addObject("Product", nproduct);

		return mv;
	}

	@ModelAttribute("categories")
	public List<Category> getCategories() {

		return categoryDao.list();
	}
}
