package com.bridgelabz.algorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int mid,first,last,N,Search,i;
		int A[]=new int[20];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter How many Element want to insert");
		N=sc.nextInt();

	     
		System.out.println("\n Elements are");
		for(i=0;i<N;i++)
		{
			A[i]=sc.nextInt();
			
		}
		
     first=0;
     last=N-1;
     mid=(first+last)/2;
		
     System.out.println("\n Enter element want to Search");
     Search=sc.nextInt();
     
     while(first<=last)
     {
    	 
    	 if(A[mid]<Search)
    	 {
    		 
    		 first=mid+1;
    		 
    		 
    	 }
    	 else if(A[mid]==Search)
    	 {
    		 
    		 System.out.println("Element Found="+Search);
    		 break;
    		 
    	 }
    	 else if(A[mid]>Search)
    	 {
    	     
    		 last=mid-1;
    	 }
    	 mid=(first+last)/2;
    	
     
    	
     }
     if(first>last)
     {		
    	 
    	 System.out.println("\n Element is Not Present");
    	 
     }
     
	}

}
