package com.bridgelabz.algorithmPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	
	static int binarySearchAlgo(String UserStringArray[], String check)
	{
		int left=0,right=UserStringArray.length-1;
		while(left<=right)
		{
			int middle = left+(right-1)/2; //to get middle value to split the array in half 
			
			//to get result by comparing user string with the array values
			int temp = check.compareTo(UserStringArray[middle]);
			
			if(temp==0)
				return middle;
			if(temp>0)
				left=middle+1;
			else {
				right=middle-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter list of word seperated by comma ',' :");
		String userString = scanner.next();
		String[] userStringArray = userString.split(",");//to split the string and store in array
		Arrays.sort(userStringArray);
		System.out.println("Enter the word to check :");
		String check = scanner.next();
		
		int result = binarySearchAlgo(userStringArray, check);
		if(result == -1)
		{
			System.out.println("Element not present");
		}
		else
			System.out.println("present at index : "+result);
		
		scanner.close();
	}

}
