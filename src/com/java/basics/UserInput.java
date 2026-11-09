package com.java.basics;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner K = new Scanner(System.in);
		System.out.println("Enter the Values ");
		byte a = K.nextByte();
		int b = K.nextInt();
		short c = K.nextShort();
		long d = K.nextLong();
		float e = K.nextFloat();
		double f = K.nextDouble();
		char g = 'c';
		boolean h = K.nextBoolean();
		
		System.out.println(a+b+c+d+e+f);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		

	}

}
