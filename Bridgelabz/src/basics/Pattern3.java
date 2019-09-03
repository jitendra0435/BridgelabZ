package basics;

public class Pattern3 {

	public static void main(String[] args)
	{
		
		int i,j;
		for(i=1;i<=5;i++)
		{  
			int temp=1;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+temp);
				temp++;
			}
			System.out.println(" ");
		}
		
		
		for(i=1;i<=4;i++)
		{   int temp=1;
			for(j=4;j>=i;j--)
		
		{   
			System.out.print(" "+temp);
			temp++;
		}
			System.out.println(" ");
		}
	}

}
