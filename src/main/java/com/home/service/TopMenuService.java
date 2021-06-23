package com.home.service;

import java.util.List;

import com.home.vo.TopMenuVO;

public interface TopMenuService  {
	public List<TopMenuVO> selectTopMenu() throws Exception;
}
