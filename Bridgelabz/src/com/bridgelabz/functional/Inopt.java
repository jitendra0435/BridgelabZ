package com.bridgelabz.functional;

import java.util.Scanner;

public class Inopt {

	public static void main(String[] args)
   {
	
		
		int a=10,b=20,c=30;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter choice");
		ch=sc.nextInt();
		
		while(ch<4)
		{
		switch(ch)
		{
		
		case 1:
			   a=a+b*c;
			   System.out.println("\n First :"+a);
			    break;
			   
		case 2:
			   a=a*b+c;
			   System.out.println("\n Secound :"+a);
			
			    break;
		case 3:
			   c=c+a/b;
			   System.out.println("\n Third :"+c);
			
			    break;
		case 4:
			
			  a=a%b+c;
			  System.out.println("\n Third :"+a);
		       break;
		      
		default: System.out.println("\n Invalid chice");
		
		}
		}

	}

}
