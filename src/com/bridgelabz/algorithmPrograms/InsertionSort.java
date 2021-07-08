package com.bridgelabz.algorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort 
{
	public static void main(String[] args) 
	{
		int i,j;
		  String key;
		  Scanner scanner = new Scanner(System.in);
			System.out.println("Enter list of word seperated by comma ',' :");
			String userString = scanner.next();
			String[] inputArray = userString.split(",");//to split the string and store in array
		  System.out.println(Arrays.toString(inputArray));
		  for (j = 1; j < inputArray.length; j++) { //the condition has changed
		    key = inputArray[j];
		    i = j - 1;
		    while (i >= 0) {
		      if (key.compareTo(inputArray[i]) > 0) {//here too
		        break;
		      }
		      inputArray[i + 1] = inputArray[i];
		      i--;
		    }
		    inputArray[i + 1] = key;
		  }
		  System.out.println("After insertion sort:\n"+Arrays.toString(inputArray));
	}	
}
