package com.bridgelabz.algorithmPrograms;

import java.util.Scanner;

public class StringPermutation {
	
	private void permute(String userStr, int left, int right)
    {
        if (left == right)
            System.out.println(userStr);
        else
        {
            for (int index = left; index <= right; index++)
            {
                userStr = swap(userStr,left,index);
                permute(userStr, left+1, right);
                userStr = swap(userStr,left,index);
            }
        }
    }
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static void printPermutationsIterative(String string){
        int [] factorials = new int[string.length()+1];
        factorials[0] = 1;
        for (int i = 1; i<=string.length();i++) {
            factorials[i] = factorials[i-1] * i;
        }

        for (int i = 0; i < factorials[string.length()]; i++) {
            String onePermutation="";
            String temp = string;
            int positionCode = i;
            for (int position = string.length(); position > 0 ;position--){
                int selected = positionCode / factorials[position-1];
                onePermutation += temp.charAt(selected);
                positionCode = positionCode % factorials[position-1];
                temp = temp.substring(0,selected) + temp.substring(selected+1);
            }
            System.out.println(onePermutation);
        }
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check :");
		String userInput = scanner.next();
		int n = userInput.length();
		StringPermutation permutation = new StringPermutation();
		System.out.println("recursive method");
        permutation.permute(userInput, 0, n-1);
        System.out.println("\nIterative method");
        StringPermutation.printPermutationsIterative(userInput);
        scanner.close();
	}

}
