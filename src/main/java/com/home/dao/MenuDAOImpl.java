package com.home.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.home.vo.MenuVO;

@Repository
public class MenuDAOImpl implements MenuDAO{
	
	@Inject
	SqlSession sqlSession;

	@Override
	public int insertMenu(MenuVO menuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("menuMapper.insertMenu",menuVO);
	}

	@Override
	public int deleteMenu(MenuVO menuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete("menuMapper.deleteMenu",menuVO);
	}

	@Override
	public int updateMenu(MenuVO menuVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("menuMapper.updateMenu",menuVO);
	}

	@Override
	public List<MenuVO> selectMenu() throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("menuMapper.selectMenu");
	}

	@Override
	public MenuVO readMenu(int menuNO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("menuMapper.readMenu",menuNO);
	}
	
	

}
