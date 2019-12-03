package com.java.uttara;

public class Searching {

	int binarySearch(int[] a, int key) {
		int low = 0;
		int high = a.length-1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (key == a[mid])
				return mid;
			else if (key > a[mid])
				low = mid + 1;
			else
				high = mid - 1;
		}
		return -1;
	}
}
