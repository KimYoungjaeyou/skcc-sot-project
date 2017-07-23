package com.lazybook.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class boardSVC {

	@Autowired
	private SqlSessionTemplate sqlSession;	
		
    public List<?> selectBoardList() throws Exception {
		return sqlSession.selectList("selectBoardList");
    }
    
    public void insertBoard(boardVO param) throws Exception {
		sqlSession.insert("insertBoard", param);
    }
    public void updateBoard(boardVO param) throws Exception {
		sqlSession.insert("updateBoard", param);
    }
 
    public boardVO selectBoardOne(String param) throws Exception {
		return sqlSession.selectOne("selectBoardOne", param);
    }
    
    public void deleteBoardOne(String param) throws Exception {
		sqlSession.delete("deleteBoardOne", param);
    }
    
}
