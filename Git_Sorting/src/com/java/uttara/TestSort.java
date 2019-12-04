package com.java.uttara;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//NOTE : Dont run all sorting algos together becoz arr gets sorted with first logic and it won't sort afterwards.
		int [] arr = {-78,-6,-90,80,25,20,30,5,25,30,10,15,-5,23};
		//int [] arr = {25,30,10,15,5,23};
		
		Sorting bs = new Sorting();
		
		int[] a= bs.bubbleSort(arr);
		
		//int[] b= bs.selectionSort(arr);
		
		//int[] c= bs.quickSort(arr, 0, arr.length-1);
		System.out.println("Sorting output.............................");
		
    	for(int ele:a)
		 System.out.println(ele+",");
		
		
	}

}
