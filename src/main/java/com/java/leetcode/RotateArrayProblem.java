package com.java.leetcode;

import java.util.Scanner;

public class RotateArrayProblem {
	
	public static void RotateElementAccodingToUser(int[] numbers, int rotation) {
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is The EXample Of The rotate An Array ");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The ELement In The Array : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter The Element for number of Rotation : ");
		int rotateElement = sc.nextInt();
		
	}

}
