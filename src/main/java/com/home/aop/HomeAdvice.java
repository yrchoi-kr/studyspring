package com.home.aop;

import java.util.List;

import javax.inject.Inject;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.home.service.MenuService;
import com.home.vo.MenuVO;

@ControllerAdvice
@Aspect
public class HomeAdvice {
	Logger logger = LoggerFactory.getLogger(HomeAdvice.class);
	
	@Inject
	MenuService menuService;
	
	@Around("execution(* com.home.controller.HomeController.*(..))")
	public Object homeManager(ProceedingJoinPoint pjp) throws Throwable{
		logger.info("홈 매니저 호출");
		return pjp.proceed();
	}

	@ModelAttribute("menuList")
	public List<MenuVO> menuList() throws Exception{
		logger.info("어트리뷰트 호출");
		return menuService.selectMenu();
	}
}
