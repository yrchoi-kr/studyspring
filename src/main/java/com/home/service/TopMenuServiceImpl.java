package com.home.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.home.dao.TopMenuDAO;
import com.home.vo.TopMenuVO;

@Service
public class TopMenuServiceImpl implements TopMenuService{

	@Inject
	TopMenuDAO topMenuDAO;
	
	@Override
	public List<TopMenuVO> selectTopMenu() throws Exception {
		// TODO Auto-generated method stub
		return topMenuDAO.selectTopMenu();
	}
}
