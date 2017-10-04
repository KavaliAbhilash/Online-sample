package com.eample.online.onlineexample.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {

		@ExceptionHandler(NoHandlerFoundException.class)
		public ModelAndView noHandlerFoundException(){
			ModelAndView mv=new ModelAndView("error");
			mv.addObject("errorTitle","the page is not constructed");
			mv.addObject("errorDescription","page not found");
			mv.addObject("title","404 error page");
			return mv;
			
		}
	




}
