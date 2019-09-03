package com.bridgelabz.functional;

public class StringPalindrome {

	public static void main(String[] args) 
	{
        String S1="NAYAN";
        String s2="";
        
        int len=S1.length();
        for(int  i=len-1;i>=0;i--)
        {
        	
        	s2=s2+S1.charAt(i);
        	
        	
        }
		if(S1.equals(s2))
		{
			
			System.out.println("\n Palindrome");
			
		}
		else
			System.out.println("\n Not palindrome");

	}

}
