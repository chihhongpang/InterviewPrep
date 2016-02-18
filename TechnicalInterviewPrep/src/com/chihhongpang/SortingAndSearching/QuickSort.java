package com.chihhongpang.SortingAndSearching;

public class QuickSort {

	public static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	private static void quickSort(int[] arr, int left, int right) {
		int index = partition(arr, left, right);
		
		if (left < index -1) quickSort(arr, left, index-1);
		if (right > index) quickSort(arr, index, right);
	}
	
	private static int partition(int[] arr, int left, int right) {
		//pick a pivot point
		int mid = (left + right) / 2;
		int pivot = arr[mid];
		
		while (left <= right) {
			while (arr[left] < pivot) left++;
			while (arr[right] > pivot) right--;
			if (left <= right) {
				swap(arr, left, right);
				left++;
				right--;
			}
		}
		return left;
	}
	
	private static void swap(int[] arr, int left, int right) {
		int leftCopy = arr[left];
		arr[left] = arr[right];
		arr[right] = leftCopy;
	}
	
	public static void main(String[] args) {
		int[] arr = {4,6,7,1,2,3,8,0};
		quickSort(arr);
		for (int element: arr) {
			System.out.println(element);
		}
		
	}

}
