package com.collegeboard.interview.numbergame;

import java.util.Scanner;

/**
 * Number game App
 * This app will identify the number you have in mind
 * Assumption is chosen number has value from 1 to 100
 * Please enter ready as input to start the game
 * Computer will guess and give output number
 * Enter clue back as one of the three possible values
 * higher or lower or yes
 */
public class App 
{
	private static final String ENDING_GAME = "Ending game. Guessed number is %d";
	private static final String READY="ready";
	private static final String HIGHER="higher";
	private static final String LOWER="lower";
	private static final String YES="yes";
	private static final String  ERROR_MSG="Number in your mind not within range of guess";
	private static final String QUESTION="Is the number %d \n";
	private static Scanner sc=new Scanner(System.in);;
    public static void main( String[] args )
    {
    	System.out.println( "please enter ready in the console to start the game" );
    	
    	if(READY.equalsIgnoreCase(sc.next()))
    	{
    		playGame();
    	}
    	else
    	{
    		System.out.println("Your input was not equal to ready. Quitting the program !!!");
    	}
        sc.close();
    }
    
    /**
     * This method contains logic of the number game
     */
	public static int playGame()
	{
		String input=null;
		int lowerBound=1, upperBound=100,guess=50;
		System.out.printf(QUESTION,lowerBound);
		input=sc.next();
		//check if the number is lower than lower bound
		if(LOWER.equalsIgnoreCase(input))
		{
			System.out.println(ERROR_MSG);
		}
		else if(YES.equalsIgnoreCase(input))
		{
			System.out.printf(ENDING_GAME,input);
		}
		//number is above the lower bound
		else 
		{
			System.out.printf(QUESTION,upperBound);
			input=sc.next();
			//check if the number is greater than upper bound
			if(HIGHER.equalsIgnoreCase(input))
			{
				System.out.println(ERROR_MSG);
			}
			else if(YES.equalsIgnoreCase(input))
			{
				System.out.printf(ENDING_GAME,input);
			}
			//number is below upper bound
			else
			{
				//looping until yes is obtained as input or upper bound =lower bound
				while(upperBound!=lowerBound && !(YES.equalsIgnoreCase(input)))
				{
					System.out.printf(QUESTION,guess);
					input=sc.next();
					//Checking if the lower bound needs to be changed
					if(HIGHER.equalsIgnoreCase(input))
					{
						lowerBound=guess;
						guess=(lowerBound+upperBound)/2;
					}
					//checking if the upper bound needs to be changed
					else if(LOWER.equalsIgnoreCase(input))
					{
						upperBound=guess;
						guess=(lowerBound+upperBound)/2;
					}
				}
				System.out.printf(ENDING_GAME,guess);
			}
		}
		return guess;
	}
}
