package com.IfElse;

import java.util.Scanner;

public class Numebrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the value of A :");
		int a = Sc.nextInt();
		System.out.println("Enter the value of B :");
		int b = Sc.nextInt();
		
		if (a >= b) {
			System.out.println("A is the Biggest value you Entered....!!!!");
		}
		else if(a < b) {
			System.out.println("B is the Biggest value you Entered....!!!!");
			}
		else {
			System.out.println("there is no value is here....!!!!");
		}
		}

}
