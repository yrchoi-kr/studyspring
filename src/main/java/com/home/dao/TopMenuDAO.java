package com.home.dao;

import java.util.List;

import com.home.vo.TopMenuVO;

public interface TopMenuDAO {
	public int insertTopMenu(TopMenuVO topMenuVO) throws Exception;
	public int deleteTopMenu(TopMenuVO topMenuVO) throws Exception;
	public int updateTopMenu(TopMenuVO topMenuVO) throws Exception;
	public List<TopMenuVO> selectTopMenu() throws Exception;
	public TopMenuVO readTopMenu(int topMenuNO) throws Exception;
}
