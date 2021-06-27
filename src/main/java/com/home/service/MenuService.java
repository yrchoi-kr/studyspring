package com.home.service;

import java.util.List;

import com.home.vo.MenuVO;

public interface MenuService  {
	public List<MenuVO> selectMenu(Integer parent) throws Exception;
}
