package sheet11;

import java.util.Scanner;

public class HarminicInfinite {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n;
		
		System.out.println("\n Enter vapue of n");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
	
			
			if(i==1)
			{
				System.out.print("1 + ");
			}
			else if(i==n)
			{
				System.out.println("1/"+n);
			}
			else
			System.out.print("1/"+i+" + ");
	
			
		}

	}

}