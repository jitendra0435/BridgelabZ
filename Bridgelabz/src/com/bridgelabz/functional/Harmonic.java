package com.bridgelabz.functional;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args)
	{
		
		
		Scanner Sc= new Scanner(System.in);
		
		System.out.println("enter the nth value of harmonic series");
		
		int n=Sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			if(i==1)
			{
				System.out.print("1 + ");
			}
			else if(i==n)
			{
				System.out.print("1/"+n);
			}
			else
			{
				System.out.print("1/"+i+" + ");
			}
		}

	}

}
