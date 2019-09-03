package com.bridgelabz.functional;


public class RemoverDuplicate 
{

	public static void main(String[] args) 
    {

		{
		int a[]=new int[]{1,2,3,4,2,5,6,7};
		
		int temp[]=new int[10] ;
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j=i+1;j<a.length-1;j++)
			{
		  
			
				if(a[i]!=a[j])
				{
					
					temp[i]=a[i];
					i++;
					
				}
				temp[i]=a[a.length-1];
				
				
			}
			
		}
		
   System.out.println("\n Array after removing duplicates=");
    
   for(int i=0;i<a.length-1;i++)
   {
	   
	   System.out.println(a[i]);
	   
   }
   
   
   
	}

    }
}
