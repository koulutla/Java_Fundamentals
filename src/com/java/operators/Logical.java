package com.java.operators;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner K = new Scanner (System.in);
		boolean b = false;
		System.out.println("Enter the Value :");
		int a = K.nextInt();
		// 3 & 5 = fizbuz , 3 || 5 = only fiz , 
		if((a % 3 == 0) && (a % 5 == 0)) {
			System.out.println("FizzBuzz");
		}
		else if ((a % 3 == 0) || (a % 5 == 0)) {
			System.out.println("Fizz");
		}
		
	if (!b){
			System.out.println("Buzz");
		}
	else {
		System.out.println("Hello Welcome ");
	}
				
	}

}
