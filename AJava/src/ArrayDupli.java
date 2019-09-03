
public class ArrayDupli {
	 
	      
	    public static void main (String[] args)  
	    { 
	        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5}; 
	        int n = arr.length; 
	          
	        int j=removeDuplicates(arr, n); 
	   
	         for(int i=0;i<n;i++)
	         {
	        	 System.out.println(arr[i]);
	         }
	     
	    } 
	    
	    
	    
	    static int removeDuplicates(int[]arr,int j)
	    {
	    	int temp[]=new int[j];
	    	int i;
	    	
	    	for(i=0;i<j-1;i++)
	    	{
	    		if(arr[i]!=arr[i+1])
	    		{
	    			
	    			temp[i++]=arr[i];
	    			
	    		}	
	    	}
	    	temp[i++]=arr[j-1];
	    	
	    	for(i=0;i<j;i++)
	    	{
	    		arr[i]=temp[i];
	    		
	    	}
	    	return j;
	    }
	    
	} 


