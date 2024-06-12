package com.charan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class WishController {
	@GetMapping("/wish")
	public String getWishMsg() {
		String msgtxt="Happy Birthday";
		return msgtxt;
	}

}
