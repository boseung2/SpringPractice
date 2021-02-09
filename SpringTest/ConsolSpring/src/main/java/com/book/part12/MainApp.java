package com.book.part12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.book.part12.Board;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext12.xml");
		
		Board board = ac.getBean("board", Board.class);
		board.boardWrite();
	}
}
