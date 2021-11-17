package com.example.src.controller;

import com.example.src.model.BoardDTO;
import com.example.src.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class BoardController {

	private final BoardService boardService;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/listAll") // 주소 호출 명시 . 호출하려는 주소 와 REST 방식설정 (GET)
	public void listAll(Model model) throws Exception { // 메소드 인자값은 model 인터페이스(jsp전달 심부름꾼)
		model.addAttribute("listAll", boardService.findAll()); // jsp에 심부름할 내역(서비스 호출)
	}

	@GetMapping("/regist") // GET 방식으로 페이지 호출
	public void registerGET(BoardDTO board, Model model) throws Exception {
	}

	@PostMapping("/regist") // POST방식으로 내용 전송
	public String registPOST(BoardDTO board, RedirectAttributes rttr) throws Exception {
		boardService.regist(board);
		return "redirect:/listAll";
	}

	@GetMapping("/modify") // GET 방식으로 페이지 호출
	public void modifyGET(@RequestParam Long id, Model model) throws Exception {
		model.addAttribute(boardService.read(id)); // 수정을 위한 글읽기 서비스 호출
	}

	@PostMapping("/modify")// POST방식으로 데이터 전송
	public String modifyPOST(BoardDTO boardDTO, RedirectAttributes rttr) throws Exception {
		boardService.modify(boardDTO); // 글수정 서비스 호출
		return "redirect:/listAll"; // 수정이 완료된 후, 목록페이지로 리턴
	}

	@PostMapping("/remove")// POST방식으로 데이터 전송
	public String removePOST(@RequestParam("id") Long id, RedirectAttributes rttr) throws Exception {
		boardService.remove(id); // 글삭제 서비스 호출
		return "redirect:/listAll"; // 삭제가 완료된 후, 목록페이지로 리턴
	}

	@GetMapping("/read") // GET 방식으로 페이지 호출
	public void read(@RequestParam Long id, Model model) throws Exception {
		// 인자값은 파라미터 값으로 기본키인 글번호를 기준으로 Model을 사용하여 불러옴
		model.addAttribute(boardService.read(id)); // read 서비스 호출
	}

}
