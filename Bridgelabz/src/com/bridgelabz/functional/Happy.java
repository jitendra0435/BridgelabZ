package com.bridgelabz.functional;

import java.util.Scanner;

public class Happy {

	public static void main(String[] args)
	{
		int num;
		int result = 0;
		int rem=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n enter no to check");
		num=sc.nextInt();
		
		
		
		while(num!=1&&num!=4)
		{
			
		while(num>0)
		{
			rem=num%10;
			sum=sum+(rem*rem);
			num=num/10;
		}
		
		}
		
		if(sum==1)
		{
			System.out.println("\n Happy number");
		}
		else 
			System.out.println("\n Not happy number");
		
	}  
	



}
