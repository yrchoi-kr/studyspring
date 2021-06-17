package com.home.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.home.dao.IF_TopMenuDAO;
import com.home.vo.TopMenuVO;





@Service
public class TopMenuService {
	@Inject
	IF_TopMenuDAO topMenuDAO;
	
	public void insertMenu(TopMenuVO topMenuVO) {
	}

}
