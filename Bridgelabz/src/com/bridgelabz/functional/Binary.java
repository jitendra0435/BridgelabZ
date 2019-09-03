package com.bridgelabz.functional;

import java.util.Scanner;

public class Binary {
	
	     public void convertBinary(int num){
	     int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a binary number:");

        String n=s.nextLine();
        
        System.out.println(Integer.parseInt(n,3));

	}

}
