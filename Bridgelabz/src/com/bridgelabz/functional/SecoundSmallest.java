package com.bridgelabz.functional;

public class SecoundSmallest {

	public static void main(String[] args) 
	{
	
		int a[]=new int[] {6,3,5,8,7,9,40};
		int smallest=a[0];
		int Ssmallest=a[0];
		int i=0;
		for(i=0;i<a.length;i++)
		{
		
			
			if(smallest>a[i])
			{
				Ssmallest=smallest;
				smallest=a[i];
				
				
			}
			else if(Ssmallest>a[i])
			{
				Ssmallest=a[i];
			}
			
			}
		
		System.out.println(Ssmallest);

	}
}


