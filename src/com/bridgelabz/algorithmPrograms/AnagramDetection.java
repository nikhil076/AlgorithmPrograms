package com.bridgelabz.algorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

	    // take input from users
	    System.out.print("Enter first String: ");
	    String userString1 = scanner.nextLine();
	    System.out.print("Enter second String: ");
	    String userString2 = scanner.nextLine();

	    // check if length is same
	    if(userString1.length() == userString2.length()) {

	      // convert strings to char array
	      char[] charArray1 = userString1.toCharArray();
	      char[] charArray2 = userString2.toCharArray();

	      // sort the char array
	      Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(userString1 + " and " + userString2 + " are anagram.");
	      }
	      else {
	        System.out.println(userString1 + " and " + userString2 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(userString1 + " and " + userString2 + " are not anagram.");
	    }

	    scanner.close();

	}

}
