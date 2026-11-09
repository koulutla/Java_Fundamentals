package com.IfElse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Age");
		int a = Sc.nextInt();
		
		if ( a >= 18) {
			System.out.println("Voter is Elegible to Vote");
		}
		else if (a <= 18) {
			System.out.println("This Voter is not Elegible");
		}
		else {
			System.out.println("Enter the correct age");
		}
		

	}

}
