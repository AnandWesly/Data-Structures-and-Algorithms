package com.anand.searchalgorithm.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int out = doBinarySearch(arr, 5);
		System.out.println("Element found at position:" + out);
	}

	public static int doBinarySearch(int[] arr, int x) {
		int i = 0;
		int j = arr.length - 1;
		int k = 0;
		while (i <= j) {
			k = (i + j) / 2;
			if (arr[k] == x) {
				return k;
			} else if (arr[k] > x) {
				j = k - 1;
			} else {
				i = k + 1;
			}
		}
		return -1;
	}
}
