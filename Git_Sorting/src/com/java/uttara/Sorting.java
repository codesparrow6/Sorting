package com.java.uttara;

public class Sorting {

	// Swapping ...................................................
	int[] swap(int[] a, int i, int j) {
		if (i != j) {
			a[i] = a[i] ^ a[j];
			a[j] = a[i] ^ a[j];
			a[i] = a[i] ^ a[j];
		}
		// If data type is integer then we can do it like this also
		/*
		 * a[i]=a[i]+a[j]; a[j]=a[i]-a[j]; a[i]=a[i]-a[j];
		 */

		return a;
	}

	// QuickSort************************************************************************************************
	// Partition Logic................................................
	int partition(int[] a, int low, int high) {
		int left = low, right = high;
		int pivot = a[low];

		while (left < right) {
			while (left < right && a[left] <= pivot)
				left++;

			while (a[right] > pivot)
				right--;

			if (left < right)
				swap(a, left, right);
		}

		swap(a, low, right);

		return right;

	}

	int[] quickSort(int[] a, int low, int high) {

		if (low >= high)
			return null;
		else {
			int pIndex = partition(a, low, high);
			quickSort(a, low, pIndex - 1);
			quickSort(a, pIndex + 1, high);
		}
		return a;
	}
	// **************************************************************************************************************

	// bubbleSort....................................................................................................
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

	// SelectionSort.................................................................................................
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

	
	
	
	
	//Merge Sort***************************************************************************************************************
	
	int[] merge(int[] a,int low,int high,int[] temp) {

		if(low == high)
			return null;
		else {
			int mid = (low+high)/2;
			merge(a,low,mid,temp);
			merge(a,mid+1,high,temp);
			
			mergeSort(a,low,mid,high,temp);
			
		}
		return a;
	}
	
	void mergeSort(int[] a,int low,int mid,int high,int[] temp) {
		int i=low,j=mid+1,k=low;
		
		while(i<=mid && j<=high) {
			if(a[i] < a[j])
				temp[k++]=a[i++];
			else
				temp[k++]=a[j++];
		}
		
		
		while(i<=mid)
			temp[k++]=a[i++];
		
		while(j<=high)
			temp[k++]=a[j++];
		
		for(int n=low ;n<=high;n++)
			a[n]=temp[n];
		
	}
	
}
