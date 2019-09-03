package com.bridgelabz.functional;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args)
	{
		
		int a[]=new int[] {10,52,30,60,80,10,36};
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter Element Want to Search");
		int Search=sc.nextInt();
		int res=Lsearch(a,Search);
		
		System.out.println("Element present At index "+res);
	}

	
	public static int Lsearch(int a[],int Search)
	{
		for(int i=0;i<a.length;i++)
		{
			
			if(Search==a[i])
			{
				return i;
			}
			
		}
		
		
		return Search;
	}
	
}
