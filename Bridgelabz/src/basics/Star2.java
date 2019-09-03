package basics;

public class Star2 {

	public static void main(String[] args)
	{
	   int i,j,k;
	   
	   for(i=1;i<=5;i++)
	   {
		   for(j=1;j<i;j++)
		   {
			   System.out.print("");
			   
		   }
		   for(k=6;k<(i*2);k--)
		   {
			   System.out.print("*");
			   
		   }
		   System.out.print("\n");
	   }
	   

	}

}
