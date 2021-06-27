package com.home.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.home.dao.MenuDAO;
import com.home.vo.MenuVO;

@Service
public class MenuServiceImpl implements MenuService{

	@Inject
	MenuDAO menuDAO;
	
	@Override
	public List<MenuVO> selectMenu() throws Exception {
		// TODO Auto-generated method stub
		return menuDAO.selectMenu();
	}
}
