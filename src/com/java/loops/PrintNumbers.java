package com.java.loops;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Value of A :");
		int a = Sc.nextInt();
		for ( int i=a; i<=10 ; i++) {
			System.out.println(i);
			
		}
	}

}
