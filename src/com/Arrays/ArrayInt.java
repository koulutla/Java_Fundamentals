package com.Arrays;

import java.util.Scanner;

public class ArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Arry :");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.print("Enter the Array List:");
		
		for(int i = 0; i < n ; i++) {
			
			a[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}

	}

}
