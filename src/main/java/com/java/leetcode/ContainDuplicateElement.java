package com.java.leetcode;

import java.util.Scanner;

public class ContainDuplicateElement {
	
	public static boolean chekcingDuplicateElement(int[] numbers , int checkedElement) {
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==checkedElement) {
				return true;
			}
		}
		return false;
	
	}
	
	public static void main(String[] args) {
		System.out.println("This is The Example Of COntain Duplicate Element ");
		System.out.println("ENter The Size Of The Array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("ENter The Element In The Array : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("ENter The target ELement");
		int target = sc.nextInt();
		boolean found = ContainDuplicateElement.chekcingDuplicateElement(arr, target);
		if(found==true) {
			System.out.println("Duplicate Element Found In The Given Array ");
		}else {
			System.out.println("No Duplicate ELement Found In The Given Array : =");
		}
	}

}
