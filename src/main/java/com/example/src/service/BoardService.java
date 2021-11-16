package com.example.src.service;

import com.example.src.model.BoardDTO;

import java.util.List;

public interface BoardService {

	String getTime();

	void regist(BoardDTO boardDTO) throws Exception;

	BoardDTO read(Long id) throws Exception;

	void modify(BoardDTO boardDTO) throws Exception;

	void remove(Long id) throws Exception;

	List<BoardDTO> findAll() throws Exception;

}
