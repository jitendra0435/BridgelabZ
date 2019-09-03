package bridgeZ;

import java.util.Scanner;

public class happynumber 
{
  
	 void ishappy()
	 {
		 int num;
		 int sum=0;
		 int rem=0;
		 Scanner sc=new Scanner(System.in);	   
		
		 System.out.println("\n enter number ");
		 num=sc.nextInt();
		   
		 
		 
		 while(num!=1&&num!=4)
		 {
			 
		 while(num>0)
		 {
			 rem=num%10;
			 sum=sum+(rem*rem);		
			 num=num/10;
		 }
		 
		 
		 }
		 
		 
		 if(sum==1)
		 {
			 
			 System.out.println("\n No is magic");
			 
		 }
		 else
		 {
			 
			 System.out.println("\n Number is not magic");
			 
		}
		 
		 
		 
		 	
	 }
	
	public static void main(String args[])
	{
		
		happynumber s1=new happynumber();
		s1.ishappy();
		
	}
	
	
}
