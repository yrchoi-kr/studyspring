package com.home.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.home.vo.TopMenuVO;

/**
 * 대메뉴 DAO
 * @author 김영제
 *
 */
@Repository
public class TopMenuDAO implements IF_TopMenuDAO {
	@Inject
	private SqlSession sqlSession;
	
	@Override
	public boolean insertMenu(TopMenuVO topMenuVO) {
		// TODO Auto-generated method stub

		return false;
	}

	@Override
	public boolean deleteMenu(TopMenuVO topMenuVO) {
		// TODO Auto-generated method stub
			sqlSession.delete("topMenuVO",topMenuVO);
			return false;
	}

	@Override
	public boolean updateMenu(TopMenuVO topMenuVO) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<TopMenuVO> selectMenu() {
		// TODO Auto-generated method stub
		return sqlSession.selectList("topMenuMapper.selectMenu");
	}

	@Override
	public TopMenuVO selectMenu(TopMenuVO topMenuVO) {
		// TODO Auto-generated method stub
		
		return sqlSession.selectOne("topMenuMapper.selectMenu",topMenuVO);
	}

	@Override
	public TopMenuVO selectMenu(int topMenuNO) {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("topMenuMapper.slectMenu",topMenuNO);
	}

}
