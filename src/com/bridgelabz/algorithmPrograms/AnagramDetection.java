package com.bridgelabz.algorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

	    System.out.print("Enter the first String value: ");
	    String userString1 = scanner.nextLine();
	    System.out.print("Enter the second String value: ");
	    String userString2 = scanner.nextLine();

	    if(userString1.length() == userString2.length()) 
	    {
	      //to store the string into character array
	      char[] charArrayFirst = userString1.toCharArray();
	      char[] charArraySecond = userString2.toCharArray();

	      //to sort both the character array 
	      Arrays.sort(charArrayFirst);
	      Arrays.sort(charArraySecond);

	      //to get the result by comparing both character array
	      boolean result = Arrays.equals(charArrayFirst, charArraySecond);

	      if(result) 
	      {
	        System.out.println(userString1 + " and " + userString2 + " are anagram.");
	      }
	      else 
	      {
	        System.out.println(userString1 + " and " + userString2 + " are not anagram.");
	      }
	    }
	    else 
	    {
	      System.out.println(userString1 + " and " + userString2 + " are not anagram.");
	    }

	    scanner.close();

	}

}
