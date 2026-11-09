package com.Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Attendance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the Employees");
		int K = Sc.nextInt();
		int[] Employees = new int[K];
		int[] Attendance = new int[K];
		for (int i=0 ; i < K; i++)
		{
			System.out.println("Employee Id:"); // 542 or else
			Employees[i] = Sc.nextInt();	
			
			System.out.println("Attendance Id:"); // 0 or 1
			Attendance[i] = Sc.nextInt();	


			}
		System.out.println("Enter Your Id:");
		int search = Sc.nextInt();
	
		
		for(int i=0;i<K;i++)
		{
			if(search == Employees[i]) {
				
			
			if(Attendance[i]==1)
			{
				System.out.println(Employees[i] + "Present");
				
			}
			else if(Attendance[i]==0)
			{
				System.out.println(Employees[i] + "Absent");
				
			}
			else {
				System.out.println(Employees[i]+ "Not Valid");
				
				
			}
			
		}
			
		}
	    
		
	}
}

		