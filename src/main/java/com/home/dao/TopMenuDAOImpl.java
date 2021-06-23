package com.home.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.home.vo.TopMenuVO;

@Repository
public class TopMenuDAOImpl implements TopMenuDAO{
	
	@Inject
	SqlSession sqlSession;

	@Override
	public int insertTopMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("topMenuMapper.insertTopMenu",topMenuVO);
	}

	@Override
	public int deleteTopMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete("topMenuMapper.deleteTopMenu",topMenuVO);
	}

	@Override
	public int updateTopMenu(TopMenuVO topMenuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("topMenuMapper.updateTopMenu",topMenuVO);
	}

	@Override
	public List<TopMenuVO> selectTopMenu() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("topMenuMapper.selectTopMenu");
	}

	@Override
	public TopMenuVO readTopMenu(int topMenuNO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("topMenuMapper.readTopMenu",topMenuNO);
	}
	
	

}
