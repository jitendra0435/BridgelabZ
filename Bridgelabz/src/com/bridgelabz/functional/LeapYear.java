package com.bridgelabz.functional;
/*Program to check the year which is entered by user is leap or Not  */

import java.util.Scanner;

public class LeapYear 
{
	
	public static void main(String[] args) 
	{
		int Year;
		int count=0;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter year to check Leap or not");
		Year=sc.nextInt();
		
		if(Year>=1582)
		{
			
			if(Year%4==0||Year%400==0&&Year%100==0)
			{
			count++;
				
			}
					
		}
		if(count>0)
		{
			
			System.out.println("\n year is Leap");
			
		}
		else
			System.out.println("\n Not leap Year");
		
		

	}

}
