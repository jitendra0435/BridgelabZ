package com.bridgelabz.functional;

public class Palindrome {

	public static void main(String[] args) 
	{
		
		String str="NAYAN";
		int length;
		int begin=0;
		int end=str.length()-1;
		
		int middle=(begin+end)/2;
		int i;
		
		
		for(i=begin;i<=middle;i++)
		{
			
			
			if(str.charAt(begin)==str.charAt(end))
			{
				begin++;
				end--;
			
			}
			else
			{
				break;
				
			}
		}
		
		
		if(i==middle+1)
		{
		System.out.println("palindrome");	
		}
		else
		{
			System.out.println("\n Not palindrome");
		}
	}
	

}
