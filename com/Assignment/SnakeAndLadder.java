package com.Assignment;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		
		int player1StartPosition=0;
		System.out.println("Player 1's initial position is: " +player1StartPosition);
		int player1Position=0;
		Random random=new Random();
		int Dice=1+random.nextInt(6);
		System.out.println(Dice);
		System.out.println("Dice value: "+Dice);
		Random random1=new Random();
		int playOption=random1.nextInt(3);
		System.out.println("Play option: "+playOption);
		switch (playOption) {
		case 0:
			System.out.println("NO PLAY "+" Player position is " +player1Position);
			break;
		case 1:
			player1Position=player1Position+Dice;
			System.out.println("Ladder!! \n Player position is " +player1Position);
			break;

		default:
			player1Position=player1Position-Dice;
			System.out.println("Snake "+"Player position is " +player1Position);
			break;
		}
	}

} 