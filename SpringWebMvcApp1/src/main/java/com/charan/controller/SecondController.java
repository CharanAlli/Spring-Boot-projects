package com.charan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecondController {
	@GetMapping("/")
	public ModelAndView getGreetMsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Good Morning");
		mv.setViewName("greet");
		return mv;
	}

}
