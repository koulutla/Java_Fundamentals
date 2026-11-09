package com.Arrays;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:"); // 5
		int n = sc.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter the Array List:");  // 10,12,15,20,54
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the K Value:");  // 20
		int k = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if(k>a[i]){   // 20 > 54
				sum += a[i];
				System.out.println(""+sum);
				
			}
			
		}
		System.out.println("After Iteration total Summ " + sum);

	}

}
