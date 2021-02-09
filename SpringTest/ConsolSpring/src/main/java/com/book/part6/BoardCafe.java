package com.book.part6;

import org.springframework.beans.factory.annotation.Autowired;

public class BoardCafe implements Board{

	@Autowired
	private Write write;
	
//	@Autowired
//	public void setWrite(Write write) {
//		this.write = write;
//	}
	
//	public BoardCafe() {
//		this.setWrite(Factory.getWriteInstance());
//	}
	
	@Override
	public void boardWrite() {
		write.doWrite();
	}
	
}
