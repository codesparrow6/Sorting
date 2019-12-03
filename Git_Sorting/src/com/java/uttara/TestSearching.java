package com.java.uttara;

public class TestSearching {
	public static void main(String[] args) {
		int[] arr = { 12, 15, 24, 27, 40, 90 };
		Searching s = new Searching();
		int index = s.binarySearch(arr, 207);
		if (index != -1)
			System.out.println("Index=" + index);
		else
			System.out.println("Element is not found");
	}
}
