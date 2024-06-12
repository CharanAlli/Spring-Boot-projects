package com.charan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public ModelAndView welcomeMsg() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg","Welcome To My Website");
		mv.setViewName("welcome");
		return mv;
	}
}
