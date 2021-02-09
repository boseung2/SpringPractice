package com.book.part4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext4.xml");
		
		Board board = ac.getBean("board", Board.class);
		Board board2 = ac.getBean("board", Board.class);
		
		System.out.println(board);
		System.out.println(board2);
		
		board.boardWrite();
	}
}
