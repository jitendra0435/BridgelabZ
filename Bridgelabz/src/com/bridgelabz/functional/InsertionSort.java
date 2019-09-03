package com.bridgelabz.functional;

public class InsertionSort {

	public static void main(String[] args) 
	{
		
		int A[]=new int[]{15,12,64,33,77,34,99};
		int i,j=0;
		int temp=0;
		
		for(i=1;i<A.length;i++)
		{
			temp=A[i];
			j=i;
			
			while(j>0&&A[j-1]>temp)
			{
				
				A[j]=A[j-1];
				j--;
			}
			A[j]=temp;
		}

		System.out.println("\n After sort");
		for(i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
		}
	}
	

}
