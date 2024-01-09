package com.java.leetcode.SearchingProblem;

import java.util.Scanner;

public class MissingNumberInArray {
	
	public static void findMissingNumber(int[] arr,int size) {
		System.out.println("The Size Of The Array is : "+size);
		int[] tempArray = new int[size+1];
		for(int i=0;i<=size;i++) {
			tempArray[i] = 0;
			System.out.println("The value of The temp Array is : from 1st loop  : "+tempArray[i]);
		}
		
		for(int i=0;i<size;i++) {
			tempArray[arr[i]-1] = 1;
			System.out.println("The Value of the temp Array from 2nd Loop is : "+ tempArray[i]);
		}
		
		int ans = 0;
		for(int i=0;i<size;i++) {
			if(tempArray[i]==0) {
				ans +=1;
			}
		}
		System.out.println("The Missing Number is : "+ ans);
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The Missing Number Example ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arrNumber = new int[size];
		for(int i=0;i<=size;i++) {
			System.out.println("ENter The ELement In The Given Array is : =");
			arrNumber[i] = sc.nextInt();
		}
		System.out.println("After Calling the find Mssing Number is : ");
		findMissingNumber(arrNumber, size);
		
	}

}
