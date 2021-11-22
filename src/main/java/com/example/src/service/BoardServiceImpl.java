package com.example.src.service;

import com.example.src.domain.BoardDAO;
import com.example.src.model.BoardDTO;
import com.example.src.model.BoardVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

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
	public List<BoardDTO> findAll() throws Exception {
		List<BoardVO> boardList = boardDAO.findAll();

		System.out.println("boardList = " + boardList.get(0).getCreatedAt());

		return boardList.stream()
			.map(boardVO -> BoardDTO.builder()
				.id(boardVO.getId())
				.title(boardVO.getTitle())
				.content(boardVO.getContent())
				.writer(boardVO.getWriter())
				.viewcnt(boardVO.getViewcnt())
				.createdAt(boardVO.getCreatedAt())
				.build()
			)
			.collect(Collectors.toList());

	}

	@Override
	public void regist(BoardDTO boardDTO) throws Exception {

		BoardVO boardVO = BoardVO.builder()
			.title(boardDTO.getTitle())
			.content(boardDTO.getContent())
			.writer(boardDTO.getWriter())
			.build();

		boardDAO.create(boardVO);
	}

	@Override
	public BoardDTO read(Long boardId) throws Exception {
		BoardVO board = boardDAO.read(boardId);


		return BoardDTO.builder()
			.id(board.getId())
			.title(board.getTitle())
			.content(board.getContent())
			.writer(board.getWriter())
			.build();

	}

	@Override
	public void modify(BoardDTO boardDTO) throws Exception {

		BoardVO boardVO = BoardVO.builder()
			.id(boardDTO.getId())
			.title(boardDTO.getTitle())
			.content(boardDTO.getContent())
			.writer(boardDTO.getWriter())
			.build();

		boardDAO.update(boardVO);
	}


	@Override
	public void remove(Long id) throws Exception {
		boardDAO.delete(id);
	}
}
