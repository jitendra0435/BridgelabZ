package com.bridgelabz.functional;

import java.util.Scanner;

public class ArmstrongNdigit 
{

	public static void main(String args[])
	{
		
		int num;
		int result=0,rem;int digit=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter number");
		num=sc.nextInt();
		 int temp=num;
		 int Check=num;
		
		while(temp!=0)
		{
			digit++;
			temp=temp/10;
			
		}
		while(num>0)
		{
			
			rem=num%10;
			result=result+(int)Math.pow(rem, digit);
			num=num/10;
			
			
		}
		
		if(result==Check)
		{
			System.out.println("\n No is Armstrong");
		}
		else
			System.out.println("\n Not armstrong number");
		
	}
	
	
	
}
