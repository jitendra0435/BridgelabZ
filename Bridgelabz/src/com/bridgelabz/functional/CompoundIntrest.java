package com.bridgelabz.functional;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) 
	{

		int amount;
		double RateOI=3.5;
		int Period;
		double CI;
		Scanner sc=new Scanner(System.in);
		
       System.out.println("\n Enter amount want to invest");
       amount=sc.nextInt();
		System.out.println("\n Enter how many periods want to invest");
		Period=sc.nextInt();
		
		CI=amount*Math.pow(1+RateOI/100, Period);
		
		
		System.out.println("Amount after invest="+CI);
		
	}

}
