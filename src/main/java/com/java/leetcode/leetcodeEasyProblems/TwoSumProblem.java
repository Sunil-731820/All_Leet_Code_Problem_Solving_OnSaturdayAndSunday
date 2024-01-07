package com.java.leetcode.leetcodeEasyProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumProblem {
	
	public static int[] getTwoSumMethod(int[] numbers, int target) {
		Map<Integer,Integer> number_pos = new HashMap<Integer, Integer>();
		for(int i=0;i<numbers.length;i++) {
			int complement = target-numbers[i];
			if(number_pos.containsKey(complement)) {
				return new int[] {
						number_pos.get(complement),i};
			}else {
				number_pos.put(numbers[i], i);
			}
		}
		return new int[] {-1,-1};
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("This is tHe Example of The Leet COde two Sum problems");
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter The Size Of The Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter The Element in The Array: ");
			arr[i] = sc.nextInt();
		}
		System.out.println("ENter The Target Element for CHecking : =");
		int target = sc.nextInt();
		int[] res = TwoSumProblem.getTwoSumMethod(arr, target);
		if(res[0] !=-1 && res[1] !=-1) {
			System.out.println("The Out is found In The given Map : ="+ res[0]+ "And : ="+res[1]);
		}else {
			System.out.println("No Solutions Is Found FOr the Given Array of The Numbers : =");
		}
		
	}

}
