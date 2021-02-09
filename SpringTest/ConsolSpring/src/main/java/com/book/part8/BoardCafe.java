package com.book.part8;

import javax.annotation.Resource;

public class BoardCafe implements Board{

	@Resource(name="qnaWrite")
	private Write write;
	
	@Override
	public void boardWrite() {
		write.doWrite();
	}
	
}
