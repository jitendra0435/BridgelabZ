package com.bridgelabz.functional;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args)
    {
		
		int Num;
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Enter number want to find Factors");
		Num=sc.nextInt();
		
	   i=2;
	   while(Num>1)
	   {
		   
		   if(Num%i==0)
		   {
			   
			   System.out.println(i+" ");
			   Num=Num/i;
			   
			   
		   }
		   else
			   i++;
		   
	   }
	   
		
		
	               
  }
		  
}
	
	


