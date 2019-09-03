package com.bridgelabz.functional;

import java.util.Scanner;

public class Mathfunction 
{
	public static void main(String args[])
	{
     
		Mathfunction f1=new Mathfunction();
		f1.harmonic();
		f1.ReturnSin();
		f1.ReturnCosine();
		f1.DecimalTobinary();
		
	}
	
	/*Math functions 
	 * for java*/
	 
	
	
		void harmonic()
		{
			Scanner Sc= new Scanner(System.in);

			System.out.println("enter the nth value of harmonic series");

			int n=Sc.nextInt();

			for(int i=1;i<=n;i++)
			{
				if(i==1)
				{
					System.out.print("1 + ");
				}
				else if(i==n)
				{
					System.out.print("1/"+n);
				}
				else
				{
					System.out.print("1/"+i+" + ");
				}

				System.out.println("");
			}
		}
	void ReturnSin()
	{
		
		
		double a=30;
		
		//Convert values to radians
		
		double b=Math.toRadians(a);
		System.out.println("Sin angle=");
		System.out.println(Math.sin(b));
		
	}
	void ReturnCosine()
	{
		
		double b=40;
		double c=Math.toRadians(b);
		System.out.println("\n Cosine Angle=");
		System.out.println(Math.cos(c));
		
	}
	void DecimalTobinary()
	{
		
		int Num=11;
		int i=0;
		int[] BinaryNum=new int[32];
		
		while(Num>0)

		{
			BinaryNum[i]=Num%2;
			Num=Num/2;
			i++;
			
			
		}
		for(int j=i-1;j>=0;j--)
		{
			
			System.out.print(BinaryNum[j]);
		}
		
	}
	
	
}
