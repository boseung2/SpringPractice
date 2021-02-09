package com.book.part12;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("board")
public class BoardCafe implements Board{

	@Resource(name="qnaWrite")
	private Write write;

	@Override
	public void boardWrite() {
		write.doWrite();
	}
	
}
