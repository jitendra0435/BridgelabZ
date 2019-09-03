package basics;

import java.util.Scanner;

public class StackOperations {
	
	
	 int Stack[]=new int[10];
		int n=4;
		int i,j;
		int top=-1;
		int value;

	public static void main(String[] args)
	{
		StackOperations A1=new StackOperations ();
		A1.push();
		A1.show();
	}

	
	void push()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter value");
		value=sc.nextInt();
		
		if(top==n)
		{
			System.out.println("\n Stack is overflow");
			
		}
		else
		{
			top=top+1;
			Stack[top]=value;
			
			
		}
		
		
		
		
	}
	void show()
	{
		
		for(i=top;i>=0;i++)
		{
			
			
			System.out.println("\t elements Are->"+Stack[i]);
		
		
		}
	}
	
}
