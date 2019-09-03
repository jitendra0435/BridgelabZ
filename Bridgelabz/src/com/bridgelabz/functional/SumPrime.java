package com.bridgelabz.functional;

import com.bridgelabz.utility.*;

public class SumPrime {

	public static void main(String[] args) 
	{
		
    	int count=1000;
		int sum=0;
		int Found;
		
		int i,j;
		
		for(i=2;i<=count;i++)
		{
			Found=0;
			for(j=1;j<=i;j++)
			{
				
				if(i%j==0)
				{
					Found++;
					
				}
				
			}
			if(Found==2)
			{
				sum=sum+j;
			}
			
		}
        System.out.println("Addition="+sum);
	}

}
