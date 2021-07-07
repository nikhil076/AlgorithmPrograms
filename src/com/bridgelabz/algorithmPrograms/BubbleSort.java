package com.bridgelabz.algorithmPrograms;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	//To sort using bubble sort algorithm 
	public static void bubbleSort(List<Integer> list) {

	    int n = list.size();
	    int temp = 0;

	    for(int i = 0; i < n-1; i++) {
	        for (int j = 0; j < (n - i - 1); j++) {

	            if (list.get(j) > list.get(j+1)) {
	                temp = list.get(j);
	                list.set(j,list.get(j+1));
	                list.set(j+1, temp);
	            }

	        }
	    }
	}
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
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
