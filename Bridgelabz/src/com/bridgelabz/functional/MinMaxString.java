package com.bridgelabz.functional;

public class MinMaxString 

{


		public static String min(String[] arr) {
	        if (arr == null || arr.length == 0)
	            return null;

	        String min = arr[0];
	        String max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (min.compareTo(arr[i]) > 0)
	            {
	                min = arr[i];
	              
	            }
	            
	        }
	        return min;
	        }
	     
	      public static String max(String[] arr) {
	          if (arr == null || arr.length == 0)
	              return null;

	          String min = arr[0];
	          String max = arr[0];

	          for (int i = 1; i < arr.length; i++) {
	        	  if (max.compareTo(arr[i]) < 0)
	              {
	                  max = arr[i];
	                
	              }
	        	 
	          } return max;
	    }


	public static void main(String[] args) {

	        String[] words = {  "xa", "had", "a", "little", "lamb" };
	       String obj = MinMaxString.min(words);
	       String obj1 =MinMaxString.max(words);
	       min(words);
	        System.out.println("Minvalue: "+obj);
	        max(words);
	       System.out.println("Maxvalue: "+obj1);
	     
	}
	}


