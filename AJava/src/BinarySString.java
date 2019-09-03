import java.util.Scanner;

public class BinarySString {

	public static void main(String[] args) {
		
		String str[]={"Ajeet", "Steve", "Rick", "Becky", "Mohan"};
		
		System.out.println("\n Enter Name want to search");
		Scanner sc=new Scanner(System.in);
		String X=sc.next();
		int Res=binary(str,X);
		
		if(Res==-1)
		{
			System.out.println("\n Element not present");
		}
		else
			System.out.println("\n Element present At index"+Res);
		    for(int i=0;i<str.length;i++)
		    {
		    	System.out.print("  "+str[i]);
		    }

	}
	public static int binary(String[] str,String x)
	{
		int l=0;
		int e=str.length-1;
		
		
		while(l<e)
		{
			int mid=(l+e)/2;
			int Res=x.compareTo(str[mid]);
			
			if(Res==0)
			{
				return mid;
			}
			
			else if(Res>0)
			{
				
				l=mid+1;
				
			}
			
			else
			{
				e=mid-1;
				
				
			}
			
			
			
		}
		return-1;
		
	}

}
