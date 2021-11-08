package com.example.src.domain;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BoardDAOImpl implements BoardDAO {

	private final SqlSession sqlSession;
	private static final String namespace = "com.example.mapper.Board";


	@Override
	public String getTime() {
		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void createBoard(BoardVO boardVO) {
		sqlSession.insert(namespace + ".create", boardVO);
	}
}
