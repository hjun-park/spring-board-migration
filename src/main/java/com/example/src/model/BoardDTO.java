package com.example.src.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardDTO {

	private Long id;
	private String title;
	private String content;
	private String writer;
	private Long viewcnt;
	private LocalDateTime createdAt;

	public BoardDTO(String title, String content, String writer) {
		this.title = title;
		this.content = content;
		this.writer = writer;
	}


	@Builder
	public BoardDTO(Long id, String title, String content, String writer, Long viewcnt, LocalDateTime createdAt) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.viewcnt = viewcnt;
		this.createdAt = createdAt;
	}
}
