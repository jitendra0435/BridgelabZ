package basics;

public class Repeat
{

	public static void main(String[] args) {
		
		int A[]= {10,20,30,40,20,10,20};
		
		int len=A.length;
		int temp[]=new int[len];
		
		for(int i=0;i<len;i++)
		{
			
			for(int j=i+1;j<len-1;j++)
			{
				if(A[i]!=A[j])
				{
					j++;
					temp[j]=A[i];
					
				}
				
				
			}
			System.out.println("\n Array after removing Duplicates");
			
			for(i=0;i<len;i++)
			{
				System.out.println(temp[i]);
			}
			
			
		}
		
		
		

	}

}
