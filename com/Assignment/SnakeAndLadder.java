package com.Assignment;

import java.util.Random;

public class SnakeAndLadder {

	
	    private static final int NO_PLAY = 0;
	    private static final int LADDER = 1;
	    private static final int SNAKE = 2;

	    public static int getRandomInteger1(int maximum, int minimum)
	    {
	        return ((int) (Math.random()*(maximum - minimum))) + minimum;
	    }

	    
	    public static void main(String[] args)
	    {

	        System.out.println(" Welcome to the Game of Snakes and Ladder");

	        int startPositionA = 0;
	        int dice = getRandomInteger1(7,1);
	        System.out.println(dice);
	        int checkPlay = (int) Math.floor(Math.random()*10)%3;
	        System.out.println(checkPlay);

	        switch(checkPlay)
	        {
	            case NO_PLAY:
	                break;

	            case LADDER:
	                startPositionA += dice;
	                break;

	            case SNAKE:
	                startPositionA -= dice;
	                break;
	        }

	    }
			
	}