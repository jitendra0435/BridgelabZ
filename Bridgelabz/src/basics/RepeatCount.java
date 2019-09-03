package basics;

public class RepeatCount {

	public static void main(String[] args) 
	{
	
		int A[]=new int[]{10,20,30,10,40,40,20,30,20};
		
		int i,j;
		int fr[]=new int[A.length];
		
		for(i=0;i<A.length;i++)
		{
			fr[i]=1;
			for(j=i+1;j<A.length;j++)
			{
				if(A[i]==A[j])        	   
				{
					fr[i]++;
					
					A[j]=-1;
					
					
				}
				
				
			}
			
			
		}
		for(i=0;i<A.length;i++)
		{
			if(A[i]!=-1)
			{
			System.out.println(A[i]+" "+fr[i]);
			}
		}

	}

}
