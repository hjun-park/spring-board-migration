package com.example.src.service;

import com.example.src.domain.BoardVO;

public interface BoardService {

	String getTime();

	void createBoard(BoardVO boardVO);
}
