package com.java.uttara;

public class TestSearching {
	public static void main(String[] args) {
		int[] arr = { 1,12, 24,24,24,24,24,24,24,25,27, 40, 90 };
		Searching s = new Searching();
		//int index = s.binarySearch(arr, 207);
		int index = s.mode(arr,0,arr.length-1, 24);
		if (index != -1)
			System.out.println("MOde=" + index);
		else
			System.out.println("Element is not found");
	}
}
