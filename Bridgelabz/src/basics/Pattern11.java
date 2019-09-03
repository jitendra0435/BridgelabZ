package basics;

public class Pattern11 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++)
		{
			int temp=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(" "+temp);
				temp--;
			}
			System.out.println(" ");
			
		}

	}

}
