package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

public class PrimeNumber {

	static void primeCal(int num)
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
			    count++;	        
			}
		}
		if(count==2)
			System.out.println(num+" is a prime number ");
		else
			System.out.println("Not a prime number ");       
	}
	public static void main(String[] args) {
		System.out.println("Enter a number ");
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		primeCal(n);
		scanner.close();
	}

}
