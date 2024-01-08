package com.java.leetcode;

import java.util.Scanner;

public class TwoSumTwoElementProblem {
	
	
	public static int[] getTwoElementFromArray(int[] number,int target) {
		int left = 0;
		int right = number.length-1;
		while(left<right) {
			int sum = number[left] + number[right];
			if(sum==target) {
				return new int[] {left+1,right+1}; 
			}
			else if(sum<target) {
				left++;
			}else {
				right--;
			}
		}
		return new int[] {-1,-1};
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The Two Sum Of Two Element problem");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The Element for THe Array is : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("ENter The target Element ");
		int targetElement = sc.nextInt();
		int[] resArray = TwoSumTwoElementProblem.getTwoElementFromArray(arr, targetElement);
		if(resArray[0] !=-1 && resArray[1] !=-1) {
			System.out.println("Element Found At : "+ resArray[0] + " And"+ resArray[1]);
		}else {
			System.out.println("no Element found for the target Sum ");
		}
	}

}
