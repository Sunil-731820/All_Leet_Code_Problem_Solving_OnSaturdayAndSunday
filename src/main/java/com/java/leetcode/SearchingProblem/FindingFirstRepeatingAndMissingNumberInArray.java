package com.java.leetcode.SearchingProblem;

import java.util.Scanner;

public class FindingFirstRepeatingAndMissingNumberInArray {
	
	public static int missingNumber(int[] arr ,int size) {
		int sum =0;
		for(int i=0;i<size;i++) {
			sum +=arr[i];
		}
		System.out.println("The Sum for Missing Number is : ="+sum);
		return ((size*(size+1))/2-sum);
	}
	
	public static int getFirstRepeatedElement(int[] arr , int size) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]==arr[j]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The Missing And Repeating number in The Array ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter ELement for the Given Array :s ");
			arr[i] = sc.nextInt();
		}
		
		int MissingNumber = missingNumber(arr, size);
		int repeatElement = getFirstRepeatedElement(arr, size);
		if(repeatElement==-1) {
			System.out.println("No Element is Repaeted In the Given Array ");
		}else {
			System.out.println("Element Are Repeated And Found At Given index is : "+ repeatElement);
		}
		System.out.println("The Missing Number is : ="+ MissingNumber);
	}

}
