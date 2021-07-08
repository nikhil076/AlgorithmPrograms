package com.bridgelabz.algorithmPrograms;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort 
{

	//To sort using bubble sort algorithm 
	public static void bubbleSort(List<Integer> list) 
	{

	    int n = list.size(); //size of the list
	    int temp = 0;

	    for(int index1 = 0; index1 < n-1; index1++) 
	    {
	        for (int index2 = 0; index2 < (n - index1 - 1); index2++) 
	        {

	            if (list.get(index2) > list.get(index2+1)) 
	            {
	            	// swapping the values 
	                temp = list.get(index2);
	                list.set(index2,list.get(index2+1));
	                list.set(index2+1, temp);
	            }

	        }
	    }
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
	    list.add(1);
	    list.add(6);
	    list.add(3);
	    list.add(4);
	    list.add(45);
	    list.add(8);
	    list.add(9);

	    bubbleSort(list);
	    System.out.println("Bubble Sort list : \n"+list);
	}

}
