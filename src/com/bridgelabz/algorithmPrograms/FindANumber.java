package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

public class FindANumber {

	public static void main(String[] args) {
		System.out.println("Think of a number");
		Scanner scan = new Scanner(System.in);
		String playAgain = "y";
		String x = null;
		String y = null;
		String i = null;

		do {
		    // Get the input from the player
		    System.out.println("Please your maximum value");

		    if (scan.hasNext()) {
		        x = scan.next();
		    }

		    System.out.println("Please input your min value");
		    if (scan.hasNext()) {
		        y = scan.next();
		    }

		    // Parse the input so its usuable in the array
		    int max = Integer.parseInt(x);
		    int min = Integer.parseInt(y);
		    int midpoint = 0;
		    boolean numberguessed = true;
		    int numberofRounds = 0;

		    while (numberguessed) {         
		        midpoint = (max + min) / 2;
		        numberofRounds++;
		        System.out.println("Is your number " + midpoint
		                + " please press (l) for too low or (h) for too high or (c) for correct");
		        if (scan.hasNext()) {
		            i = scan.nextLine();
		        }
		        System.out.println(i);
		        if (i.equalsIgnoreCase("h")) {
		            min = midpoint;
		        } else if (i.equalsIgnoreCase("l")) {
		            max = midpoint;
		            min = 0;
		        } else if (i.equalsIgnoreCase("c")) {
		            System.out.println("the number of rounds in this game is"
		                    + numberofRounds);
		            break;
		        }

		    }
		    System.out.println("Press y to play again");
		    if (scan.hasNext()) {
		        playAgain = scan.next();
		    }
		    System.out.println("Game over");
		} while (playAgain.equalsIgnoreCase("y"));
		scan.close();
	}
}
