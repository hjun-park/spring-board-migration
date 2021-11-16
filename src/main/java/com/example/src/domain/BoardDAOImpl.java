package com.example.src.domain;

import com.example.src.model.BoardVO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.List;

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
	public void create(BoardVO boardVO) {
		sqlSession.insert(namespace + ".create", boardVO);
	}

	@Override
	public BoardVO read(Long id) throws Exception {
		return sqlSession.selectOne(namespace + ".read", id);
	}

	@Override
	public void update(BoardVO boardVO) throws Exception {
		sqlSession.update(namespace + ".update", boardVO);
	}

	@Override
	public void delete(Long id) throws Exception {
		sqlSession.delete(namespace + ".delete", id);
	}


	@Override
	public List<BoardVO> findAll() {
		return sqlSession.selectList(namespace + ".findAll");
	}
}
