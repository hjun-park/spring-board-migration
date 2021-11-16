package com.example.src.domain;

import com.example.src.model.BoardVO;

import java.util.List;

public interface BoardDAO {

	String getTime();

	void create(BoardVO boardVO) throws Exception;

	BoardVO read(Long id) throws Exception;

	void update(BoardVO boardVO) throws Exception;

	void delete(Long id) throws Exception;

	List<BoardVO> findAll() throws Exception;


}
