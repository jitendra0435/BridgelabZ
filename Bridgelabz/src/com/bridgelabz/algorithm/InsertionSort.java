package com.bridgelabz.algorithm;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args)
	{
		int a[]=new int[10];
		int temp,i,N,j;
		
		System.out.println("\n Enetr how many element want to insert ");
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		
		System.out.println("\n Array Elements Are:");
		for(i=0;i<N;i++)
		{
			
		a[i]=sc.nextInt();	
			
		}
		for(i=0;i<N;i++)
	
		{
			
			for(j=i+1;j<N;j++)
			{
				
				if(a[i]>a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
					
				}
				
			}
			
		}
		System.out.println("\n Array After Sort=");
		for(i=0;i<N;i++)
		{
			System.out.println(a[i]);
		}

	}

}
