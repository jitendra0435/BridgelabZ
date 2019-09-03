package basics;

public class Insertion {

	public static void main(String[] args)
	{
		
		int array[]=new int[] {22,66,44,33,88,99,77,24};
		
		int i,j;
		
		
	
		for(i=1;i<array.length;i++)
		{
			int temp=array[i];
			j=i;
			
			while(j>0&&array[j-1]>temp)
			{
				
				array[j]=array[j-1];
				j--;
				
				
			}
			array[j]=temp;
			
		}
	for(i=0;i<array.length;i++)
	{
		
		System.out.println(array[i]);
		
	}

	}

}
