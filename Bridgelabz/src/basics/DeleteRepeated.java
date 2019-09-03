package basics;

public class DeleteRepeated {

	public static void main(String[] args) 
	{
		
		int Arr[]=new int[] {10,20,30,10,40,50,20};
		int temp[]=new int [Arr.length];
		int i,j;
		
		for(i=0;i<Arr.length;i++)
		{
			for(j=i+1;j<Arr.length-1;j++)
			{
				
				if(Arr[i]!=Arr[j])
				{
					
					temp[i]=Arr[i];
					
					i++;
					
					
				}
				temp[i]=Arr[Arr.length-1]
			}
			
		}
		System.out.println("\n Array after removing dulicates");
		
		for(i=0;i<Arr.length;i++)
		{
		
			
			System.out.println(temp[i]);
		
		}

	}

}
