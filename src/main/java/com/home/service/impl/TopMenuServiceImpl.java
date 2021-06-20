package com.home.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.home.dao.TopMenuDAO;
import com.home.vo.TopMenuVO;





@Service
public class TopMenuServiceImpl {
	@Inject
	TopMenuDAO topMenuDAO;
	
	public void insertMenu(TopMenuVO topMenuVO) {
	}

}
