package com.java.leetcode.SearchingProblem;

import java.util.Scanner;

public class SearchingElementInSortedArray {
	
	public static int getSearchElement(int[] arr , int size ,int searchELement) {
		int left = 0, right = arr.length;
		while(left<=right) {
			int mid = left + (right-left)/2;
			
			if(searchELement==arr[mid]) {
				return mid;
			}
			else if(searchELement>arr[mid]) {
				getSearchElement(arr, size, searchELement);
			}
		}
		return right;
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of The Searching The ELement In Sorted Array : ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array ");
		int size = sc.nextInt();
		int[] arrNumber = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter ELement In The Array ");
			arrNumber[i] = sc.nextInt();
		}
	}

}
