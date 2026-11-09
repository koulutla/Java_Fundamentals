package com.java.operators;

import java.util.Scanner;

public class Arthamatic {
	 public static void main(String[] args) {
		
		 // Arithmetic operators = + , - , * ,  / , // , % ;
		 Scanner K = new Scanner (System.in);
		 System.out.println("Enter the value of a :");
		 int a = K.nextInt();
		 System.out.println("Enter the value of b :");
		 int b = K.nextInt();
		 
		 int c = a+b;
		 int d = a-b;
		 int e = a*b;
		 int f = a/b;
		 int g = a % b;
		 long h = a/b;
		 
		 System.out.println("Results of Operations :");
		 System.out.println(c);
		 System.out.println(d);
		 System.out.println(e);
		 System.out.println(f);
		 System.out.println(g);
				 
	}
}
