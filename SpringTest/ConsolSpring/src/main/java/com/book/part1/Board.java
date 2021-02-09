package com.book.part1;

public class Board {
	private Write write;
	
	public void setWriter(Write write) {
		this.write = write;
	}
	
	public Board() {
		this.setWriter(new Write());
	}
	
	public void boardWrite() {
		write.doWrite();
	}
}
