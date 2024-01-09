package com.java.leetcode.SearchingProblem;

import java.util.Scanner;

public class ThreeLargestNumberInArray {
	
	public static void sortingArry(int[] arr , int size) {
		for(int i=0;i<size;i++) {
			System.out.println(arr[i]+" +++++++++++++++++++++");
			for(int j = i+1;j<size;j++) {
				System.out.println(arr[j]+"+++++++++++++++++++++");
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of The Array: ");
		int size = sc.nextInt();
		int[] arrNumber = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The ELement In The Array : ");
			arrNumber[i] = sc.nextInt();
		}
		System.out.println("After calling The Sorting method is : ");
		sortingArry(arrNumber, size);
		System.out.println("The Three ELement is The Array is : =");
		for(int i=0;i<3;i++) {
			System.out.print(arrNumber[i]+ " ");
		}
		
		
	}

}
