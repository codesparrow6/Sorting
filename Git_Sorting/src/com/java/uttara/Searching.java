package com.java.uttara;

public class Searching {

	//Searching s = new Searching();
	
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
	
	
	//Find the mode of given value in an array..................................................
	//*Mode means - Number of times repeated
	
   static int firstOccurence(int[] a,int low,int high,int key) {
		int mid = (low +high)>>1;
		if(low > high)
			return -1;
		else if((a[mid]==key && mid==low) || (a[mid]==key && a[mid-1]<a[mid])) 
			return mid;
		else if(a[mid] < key)
			return firstOccurence(a, mid+1, high, key);
		else if(a[mid]>key)
			return firstOccurence(a, low, mid-1, key);
		else
			return firstOccurence(a, low, mid-1, key);

	}
	
	static int lastOccurence(int[] a,int low,int high,int key) {
		int mid = (low +high)>>1;
		if(low > high)
			return -1;
		else if((a[mid]==key && mid==high) || (a[mid]==key && a[mid+1]>a[mid])) 
			return mid;
		else if(a[mid] < key)
			return lastOccurence(a, mid+1, high, key);
		else if(a[mid]>key)
			return lastOccurence(a, low, mid-1, key);
		else
			return lastOccurence(a, mid+1, high, key);

	}
	
	int mode(int[] a,int low,int high,int key) {
		int firstOccr =firstOccurence(a, low, high, key);
		int lastOccr = lastOccurence(a, low, high, key);
		return lastOccr-firstOccr+1; 
	}
	
}
