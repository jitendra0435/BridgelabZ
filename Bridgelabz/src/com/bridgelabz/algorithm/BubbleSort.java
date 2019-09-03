package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BubbleSort 
{ 

	int a[]=new int[10];
	int temp;
	Scanner sc=new Scanner(System.in);
	
	void Bubble()
	{
		
		System.out.println("\n Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			
			a[i]=sc.nextInt();
			
		}
		
		System.out.println("\n Array element after Sorting");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	
}
	
	
	public static void main(String args[])
	{
		
		BubbleSort S1=new BubbleSort();
		S1.Bubble();
		
	}
}
