package com.book.part8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.book.part1.Board;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ac = new GenericXmlApplicationContext("spring/springcontext5.xml");
		
		BoardCafe board = ac.getBean("board", BoardCafe.class);
		board.boardWrite();
	}
}
