package com.bridgelabz.functional;

import java.util.Scanner;

public class MINMAXArr {

	public static void main(String[] args) 
	{
		
		int A[]=new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.print("  Enter Array elements");
		
		for(int i=0;i<10;i++)
		{
			
			A[i]=sc.nextInt();
			
		}
		int Max=A[0];
		int Min=A[0];
		for(int i=1;i<10;i++)
		{
			
			if(Max<A[i])
			{
				Max=A[i];
			}
			if(Min>A[i])
			{
				Min=A[i];
			}
			
		}
		System.out.println("Maximum element="+Max);
		System.out.println("\n Minimum Elements from Array="+Min);

	}

}
