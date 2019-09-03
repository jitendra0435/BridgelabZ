package com.bridgelabz.functional;

import java.util.Scanner;

public class Anagram {
	
	void CheckAnagram()
	{
		String S1="";
		String S2="";
		int found=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter String First to Check Anagram or Not");
		S1=sc.next();
		System.out.println("\n Enter String Secound to Check Anagram or Not");
		S2=sc.next();
		int len1=S1.length();
		int len2=S2.length();
		
		if(len1==len2)
		{
			int len=len1=len2;
			for(int i=0;i<len;i++)
			{
				for(int j=0;j<len;j++)
				{
					
					if(S1.charAt(i)==S2.charAt(j))
					{
						
						found++;
						break;
						
						
					}
				}
			}
				
				if(found>=S1.length())
				{
					System.out.println("Strings are Anagram"); 
					
					
				}
				else
					System.out.println("\n Strings Are Not  Anagram");
				
			}
		
		else
			System.out.println("\n Length of Strings Are Varies");
		
		
	}
	
	
	boolean CheckPalindrome()
	{
		
		String s1="";
		String s2="";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter string to check palindrome or Not");
		s1=sc.next();
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);		
		}
		
		if(s2.equals(s1))
		{
			
			return true;
			
		}
		else
			System.out.println("\n Not palindrome");
	         return true;	
	}

	public static void main(String[] args) 
	{
		
		Anagram A1=new Anagram();
		
		int ch;
		while(true)
		{
		System.out.println("\n 1:CheckAnagram \n 2:CheckPalindome 3:Exit");
		System.out.println("Enter your choice");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch)
		{
		   
		case 1:
			   A1.CheckAnagram();
			   break;
		case 2:
			  A1.CheckPalindrome();
		      break;
		case 3:
			  System.exit(0);;
		      break;
		
	    default:
	    	    System.out.println("\n Invalid choice");
		}
		
		}  
	
		
	}

}
