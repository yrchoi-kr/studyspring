package com.home.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.service.MenuService;

@Controller
public class AdminController {
	
	@Inject
	private MenuService menuService;
	
	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public String adminMainPage() throws Exception{
		menuService.selectMenu();
		return "";
	}
}
