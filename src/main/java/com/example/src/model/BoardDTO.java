package com.example.src.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardDTO {

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
	public BoardDTO(String title, String content, String writer, Long viewcnt, LocalDateTime createdAt) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.viewcnt = viewcnt;
		this.createdAt = createdAt;
	}
}
