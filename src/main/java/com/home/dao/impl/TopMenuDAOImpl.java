package com.home.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.home.dao.TopMenuDAO;
import com.home.vo.TopMenuVO;

@Repository
public class TopMenuDAOImpl implements TopMenuDAO{
	
	@Inject
	SqlSession sqlSession;

	@Override
	public int insertMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<TopMenuVO> selectTopMenu() throws Exception {
		// TODO 탑 메뉴 모두 불러오기
		return sqlSession.selectList("topMenuMapper.selectMenu");
	}

	@Override
	public TopMenuVO readMenu(int topMenuNO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
