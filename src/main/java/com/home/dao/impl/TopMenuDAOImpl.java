package com.home.dao.impl;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.home.dao.TopMenuDAO;
import com.home.vo.TopMenuVO;

/**
 * 대메뉴 DAO
 * @author 김영제
 *
 */
@Repository
public class TopMenuDAOImpl implements TopMenuDAO {
	@Inject
	private SqlSession sqlSession;

	@Override
	public int insertMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("topMenuMapper.insertMenu", topMenuVO);
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
	public List<TopMenuVO> selectMenu() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopMenuVO selectMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TopMenuVO selectMenu(int topMenuNO) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
