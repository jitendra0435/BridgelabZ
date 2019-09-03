package com.bridgelabz.functional;

public class Isprime {
	
		static boolean isPrimeNumber(int number)
		{
        
        for(int i=2; i<=number/2; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
            
        }
		return true;
        
		}	

	public static void main(String[] args) 
	{
	
		if(isPrimeNumber(10))
		{
			System.out.println("true");
			
			
		}
		else
			System.out.println("false");
			
		

	}

}
