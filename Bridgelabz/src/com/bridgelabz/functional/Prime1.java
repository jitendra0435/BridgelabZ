package com.bridgelabz.functional;

public class Prime1 {

	public static void main(String[] args) 
	{
		 int number = 2;
	        int count = 0;
	        long sum = 0;
	        while(count < 1000)
	        {
	        	int num=1000;
			    int i=2;
			
			while(num>1)
			{
				
			 if(num%i==0)
			 {
				 System.out.println(i);
			 }
				i++;
				
			}
	            if(isPrimeNumber(number)){
	                sum += number;
	                count++;
	            }
	            number++;
	        }
	        System.out.println(sum);
	    }
	     
	    private static boolean isPrimeNumber(int number){
	         
	        for(int i=2; i<=number/2; i++)
	        {
	            if(number % i == 0){
	                return false;
	            }
	        }
	        return true;

	}

}
