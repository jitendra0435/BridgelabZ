package com.bridgelabz.functional;

public class StringBubble {

	public static void main(String[] args) {
		
		String []s1= {"abc","nhj","tyu","oip"};
		for(int i=0;i<=s1.length;i++)
		{
			for(int j=i+1;j<s1.length-1;j++)
			{
				if(s1[i].compareTo(s1[j])>0)
				{
					String temp=s1[i];
					s1[i]=s1[j];
					s1[j]=temp;
					
					
				}
			}
			
		}
		System.out.println("Array after sort:");

		for(int i=0;i<=s1.length-1;i++)
		{
			System.out.println(s1[i]);
			
		}
			
			
		}
	

}
