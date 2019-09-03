package basics;

public class Pascal {

	public static void main(String[] args) 
	{
	   int i,j,temp=1,k;
	   
	   for(i=1;i<=5;i++)
	   {
		   for(j=1;j<=i;j++)
		   {
			   
			   System.out.print("  ");
			   
			   
		   }
		   for(k=5;k>0;k--)
		   {
			   System.out.print(+temp+"");
			   
		  }
		   System.out.println(" ");
	   }
	   

	}

}
