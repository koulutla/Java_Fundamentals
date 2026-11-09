package com.java.basics;

import java.util.Arrays;
import java.util.Scanner;

public class NonPremitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner Sc = new Scanner(System.in);
		 System.out.println("Enther the value :");  // size = 5
		 int K = Sc.nextInt();
		 int[] arr = new int[K];
		 System.out.println("Enter Array Elements: ");
		 for (int i = 0; i < arr.length ; i++)     // [3,4,8,6,0]
		 {
			 arr[i] = Sc.nextInt();
			 
		 }
		 System.out.println(Arrays.toString(arr)); // [3,4,8,6,0]
		 System.out.println(arr[2]); // [8]
	}

	
	
}
