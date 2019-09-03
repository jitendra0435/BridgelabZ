package com.bridgelabz.functional;

import java.util.Random;

public class Rolldie {

	public static void main(String[] args)
	{
		int i;
		Random rand=new Random();
		
		System.out.println("The Values On Dice Are:");
		for(i=1;i<=6;i++)
		{
			System.out.print("\t"+(rand.nextInt(6)+1));
			
		}
      
	
	}

}
