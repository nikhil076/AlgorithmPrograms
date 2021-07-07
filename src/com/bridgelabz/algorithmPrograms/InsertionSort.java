package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

public class InsertionSort 
{
	//to insert value using insertion sort algorithm
	public static String[] insertionSortAlgo(String array[], int arrayLength)
	{
		//temporary string to store the value
		String temp="";
		for(int i=0;i<arrayLength;i++)
		{
			for(int j=i+1;j<arrayLength;j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter list of word seperaated by comma ',' :");
		String userString = scanner.next();
		String[] arr =userString.split(",");
		String sortedArray[] = insertionSortAlgo(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]);
		}
		scanner.close();
	}	
}
