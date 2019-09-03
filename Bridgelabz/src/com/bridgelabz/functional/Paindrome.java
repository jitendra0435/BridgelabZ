package com.bridgelabz.functional;

import java.util.Scanner;

public class Paindrome {

	public static void main(String[] args)
	{
	
		  int num;
		  int rem,sum=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("\n Enter number ");
		  num=sc.nextInt();
		  int temp=num;
		  while(num>0)
		  {
			  
			rem=num%10;
			sum=(sum*10)+rem;
			
			num=num/10;
			  
		  }
		  
		if(sum==temp)	  
		{
			System.out.println("\n No is palindfrome");
			
			
		}
		else
		{
		
			System.err.println("\n Not palindrome");
		}

	}

}
