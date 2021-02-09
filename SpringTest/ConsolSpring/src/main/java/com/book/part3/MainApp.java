package com.book.part3;

import com.book.part4.Board;
import com.book.part4.Factory;

public class MainApp {
	public static void main(String[] args) {
		Board board = Factory.getBoardInstance();
		board.boardWrite();
	}
}
