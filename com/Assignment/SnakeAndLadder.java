package com.Assignment;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		int player1StartPosition=0;
		
		System.out.println("Player 1's initial position is: " +player1StartPosition);
		
		Random random=new Random();
		int Dice=1+random.nextInt(6);
		System.out.println(Dice);
	}

} 