package basics;

public class Pattern12A {

	public static void main(String[] args) {
		
		int i,j;int temp;
		
		for(i=1;i<=5;i++)
		{
			 temp=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+temp);
				
				temp=temp+5;
				
			}
			System.out.println(" ");
			
		}

	}

}
