package com.java.uttara;

public class Sorting {

	// Swapping ...................................................
	int[] swap(int[] a, int i, int j) {
		a[i] = a[i] ^ a[j];
		a[j] = a[i] ^ a[j];
		a[i] = a[i] ^ a[j];
		// If data type is integer then we can do it like this also
		/*
		 * a[i]=a[i]+a[j]; a[j]=a[i]-a[j]; a[i]=a[i]-a[j];
		 */

		return a;
	}

	int[] bubbleSort(int[] a) {
		int len = a.length;
		int i, pass;

		for (pass = len - 1; pass >= 1; pass--) {
			for (i = 0; i < pass; i++) {
				if (a[i] > a[i + 1]) {
					// common swapping technique with "Temp" variable
					/*
					 * int temp=a[i]; a[i]=a[i+1]; a[i+1]=temp;
					 */
					a = swap(a, i, i + 1);
				}
			}
		}
		return a;
	}

	int[] selectionSort(int[] a) {
		int n = a.length;
		for (int pos = 0; pos < (n - 1); pos++) {
			int min = pos;
			for (int i = pos; i < (n - 1); i++) {
				if (a[min] > a[i])
					min = i;
			}
			a = swap(a, pos, min);
		}
		return a;
	}

}
