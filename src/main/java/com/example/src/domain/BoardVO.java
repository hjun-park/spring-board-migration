package com.example.src.domain;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class BoardVO {

	private Long id;
	private String title;
	private String content;

	@Builder
	public BoardVO(Long id, String title, String content) {
		this.id = id;
		this.title = title;
		this.content = content;
	}
}
