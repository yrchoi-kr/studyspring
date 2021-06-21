package com.home.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.home.service.TopMenuService;

@Service
public class TopMenuServiceImpl implements TopMenuService{

	@Inject
	TopMenuService topMenuService;
	
	@Override
	public int selectMenu() throws Exception {
		// TODO Auto-generated method stub
		return topMenuService.selectMenu();
	}
}
