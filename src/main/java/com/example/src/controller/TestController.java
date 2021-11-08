package com.example.src.controller;

import com.example.src.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	private final BoardService boardService;

	public TestController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/test")
	public String test() {
		return "HELLO";
	}

	@GetMapping("/time")
	public String getTime() {
		return boardService.getTime();
	}
}
