package com.bridgelabz.functional;

public class Colinear {

	public static void main(String[] args) 
	{
		
		int a1=1,a2=1,a3=0;
		int b1=1,b2=6,b3=9;
		
		if((b3-b2)*(a2-a1)==(b2-b1)*(a3-a2))
		{
	
			System.out.println("\n Colinear");
			
		} 
		else
			System.out.println("\n Not Colinear");
		
		

	}

}
