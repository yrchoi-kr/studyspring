package com.home.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.home.service.TopMenuService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	/**
	 * 홈 컨트롤러
	 */
	private Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private TopMenuService topMenuService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) throws Exception {
		logger.info("홈 컨트롤러 호출");
		model.addAttribute("topMenuList", topMenuService.selectTopMenu());
		return "home/index";
	}
}
