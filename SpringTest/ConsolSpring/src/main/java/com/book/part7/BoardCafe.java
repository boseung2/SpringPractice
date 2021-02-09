package com.book.part7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BoardCafe implements Board{

	@Autowired
	@Qualifier("qnaWrite")
	private Write write;
	
//	public BoardCafe() {
//		this.setWrite(Factory.getWriteInstance());
//	}
	
	public void setWrite(Write write) {
		this.write = write;
	}
	
	@Override
	public void boardWrite() {
		write.doWrite();
	}
	
}
