package com.home.dao;

import java.util.List;

import com.home.vo.MenuVO;

public interface MenuDAO {
	public int insertMenu(MenuVO MenuVO) throws Exception;
	public int deleteMenu(MenuVO MenuVO) throws Exception;
	public int updateMenu(MenuVO MenuVO) throws Exception;
	public List<MenuVO> selectMenu(Integer parent) throws Exception;
	public MenuVO readMenu(Integer MenuIndex) throws Exception;
}
