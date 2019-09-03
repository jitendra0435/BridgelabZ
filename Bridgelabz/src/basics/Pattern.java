package basics;

public class Pattern {

	public static void main(String[] args) {
	
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			int temp=1;
			for(j=5;j>=i;j--)
			{
				
				System.out.print(" "+temp);
				temp=temp+5-j;
			}
			System.out.println(" ");
			
		}

	}

}
