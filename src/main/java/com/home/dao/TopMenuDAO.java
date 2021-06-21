package com.home.dao;

import java.util.List;

import com.home.vo.TopMenuVO;

public interface TopMenuDAO {
	public int insertMenu(TopMenuVO topMenuVO) throws Exception;
	public int deleteMenu(TopMenuVO topMenuVO) throws Exception;
	public int updateMenu(TopMenuVO topMenuVO) throws Exception;
	public List<TopMenuVO> selectTopMenu() throws Exception;
	public TopMenuVO readMenu(int topMenuNO) throws Exception;

}
