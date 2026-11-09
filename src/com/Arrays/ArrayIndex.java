package com.Arrays;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Array Size:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];        // 10,20,30,40,50
		int sum = 0;
		System.out.println("Enter the array list:");
		for (int i = 0; i < n; i++) { 
			a[i] = sc.nextInt();
		}
		for(int i =0; i < n; i++) {
			sum += a[i];
		}
		System.out.println(sum);
	}

}
