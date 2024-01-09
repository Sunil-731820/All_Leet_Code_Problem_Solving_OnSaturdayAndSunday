package com.java.leetcode.SearchingProblem;

import java.util.Scanner;import jakarta.validation.constraints.Size;

public class MissingNumberInArray {
	
	public static int  findMissingNumber(int[] arr , int N) {
		int sum =0;
		for(int i=0;i<N;i++) {
			sum +=arr[i];
		}
		
		return ((N*(N+1))/2-sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size of The Array : ");
		int size = sc.nextInt();
		int[] arrNumber = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter ELement ");
			arrNumber[i] = sc.nextInt();
		}
		
		int MissingNumber = findMissingNumber(arrNumber, size);
		System.out.println("The Missing Number is : "+MissingNumber);
		
		
	}

}
