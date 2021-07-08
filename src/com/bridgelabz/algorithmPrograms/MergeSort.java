package com.bridgelabz.algorithmPrograms;

import java.util.Arrays;

public class MergeSort {
	 public static void mergeSort(String[] userSting, int start, int end) {
	        if (start == end) {
	            return;
	        }
	        int middle = (start + end) / 2;
	        // sort the first and the second half
	        mergeSort(userSting, start, middle);
	        mergeSort(userSting, middle + 1, end);
	        merge(userSting, start, middle, end);
	    }

	    public static void merge(String[] a, int start, int middle, int end) {
	        int n = end - start + 1;       
	        String[] b = new String[n];   
	        int index1 = start;              
	        int index2 = middle + 1;        
	        int index3 = 0;              

	        // till index1 nor index2 past the end, move the smaller into b
	        while (index1 <= middle && index2 <= end) {
	            if (a[index1].compareTo(a[index2]) < 0) {
	                b[index3] = a[index1];
	                index1++;
	            } else {
	                b[index3] = a[index2];
	                index2++;
	            }
	            index3++;
	        }

	        // copy any remaining entries of the first half
	        while (index1 <= middle) {
	            b[index3] = a[index1];
	            index1++;
	            index3++;
	        }

	        while (index2 <= end) {
	            b[index3] = a[index2];
	            index2++;
	            index3++;
	        }
	        for (index3 = 0; index3 < n; index3++) {
	            a[start + index3] = b[index3];
	        }
	    }

	public static void main(String[] args) {
		String[] values = {"new", "value", "inside", "the", "next", "element"};
        mergeSort(values, 0, values.length - 1);
        System.out.println("Result " + Arrays.toString(values));
	}

}
