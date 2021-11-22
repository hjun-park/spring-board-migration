package com.example.src.model;


import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardVO {

	private Long id;
	private String title;
	private String content;
	private String writer;
	private Long viewcnt;
	private Timestamp createdAt;

	@Builder
	public BoardVO(Long id, String title, String content, String writer, Timestamp createdAt) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.createdAt = createdAt;
	}
}
