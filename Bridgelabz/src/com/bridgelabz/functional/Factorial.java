package com.bridgelabz.functional;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int fact=1;
		int i;
		int num;
		
		System.out.println("\n enter number to find Fatctorial");
		num=sc.nextInt();
		
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}

		System.out.println("Factorial="+fact);
	}

}
