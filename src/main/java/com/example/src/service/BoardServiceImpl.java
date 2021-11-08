package com.example.src.service;

import com.example.src.domain.BoardVO;
import com.example.src.domain.BoardDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

	private final BoardDAO boardDAO;

	@Override
	public String getTime() {
		return boardDAO.getTime();
	}

	@Override
	public void createBoard(BoardVO boardVO) {
		boardDAO.createBoard(boardVO);
	}
}
