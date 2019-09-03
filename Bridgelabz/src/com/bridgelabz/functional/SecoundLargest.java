package com.bridgelabz.functional;

public class SecoundLargest {

	public static void main(String[] args) 
	{
		
		int a[]=new int[] {20,50,20,30,40,58};
    	
		int Large=a[0];
		int Slarge=a[0];
    	
		for(int i=0;i<a.length;i++)
		{
		
			if(a[i]>Large)

            {
	              Slarge=Large;
	              Large=a[i];
            	
            }
			else if(a[i]>Slarge)
			{
				
				Slarge=a[i];
            	
			}
		}
	
		System.out.println("\n Secound Largest Element in Array:"+Slarge);
	}
	
	
	

}
