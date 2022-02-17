package com.solsol.exam.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.solsol.exam.demo.vo.Article;





@Controller
public class UsrHomeController {
	@RequestMapping("/usr/home/main")
	
	public String showMain() {
		return "usr/home/main";
	}
	
	@RequestMapping("/")
	
	public String getRoot() {
		return "redirect:/usr/home/main";
	}
	
}


