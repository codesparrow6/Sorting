package com.java.uttara;

public class TestSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {-78,-6,-90,80,25,20,30,5,10,15,-5,23};
		Sorting bs = new Sorting();
		int[] a= bs.bubbleSort(arr);
		
		int[] b= bs.bubbleSort(arr);
		System.out.println("Bubble sort output.............................");
		for(int ele:a)
         System.out.println(ele+",");
		
		System.out.println("Selection sort output.............................");
		for(int ele:b)
	         System.out.println(ele+",");
	}

}
