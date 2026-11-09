package com.java.loops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		
		do {
			// System.out.println("Hello this is Do while programe");
			System.out.println(a);
			a++;
		}while (a <= 50);
		
	}

}
