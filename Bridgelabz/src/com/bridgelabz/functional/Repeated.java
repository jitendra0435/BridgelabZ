package com.bridgelabz.functional;

public class Repeated {

	public static void main(String[] args)
	{
		int a[]=new int[] {10,20,30,40,50,60,10,60};
		int i,j;
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
				
				
				
			}
			
		}

	}

}
