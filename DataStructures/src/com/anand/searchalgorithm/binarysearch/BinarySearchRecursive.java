package com.anand.searchalgorithm.binarysearch;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int out = doBinarySearch(arr, 0, arr.length - 1, 8);
		System.out.println("Element found at position:" + out);
	}

	public static int doBinarySearch(int[] arr, int i, int j, int x) {
		int k = (i + j) / 2;
		if (i > j) {
			return -1;
		} else if (arr[k] == x) {
			return k;
		} else if (arr[k] > x) {
			return doBinarySearch(arr, i, k - 1, x);
		} else {
			return doBinarySearch(arr, k + 1, j, x);
		}

	}
}
