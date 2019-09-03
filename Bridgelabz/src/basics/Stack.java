package basics;

import java.util.Scanner;

public class Stack {
	
	static int top;
	static int stack[]=new int[5];

	public static void main(String[] args) {
		
		int ch;
		int data;
		int top=-1;
		int stack[]=new int[5];

		int size=5;
		Scanner sc=new Scanner(System.in);
		
		while(true) 
		{
		System.out.println("\n Stack operations=");
		System.out.println("\n 1:push \n 2:Pop \n 3:Display \n 4:Exit");
		System.out.println("\n Enter your choice=");
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			  System.out.println("\n Enter element want to insert ");
			  data=sc.nextInt();
			  data=push(data, stack,top);
			  System.out.println("Entered data->"+data);
			  break;
		
		case 2:
			    break;
	
			    
		case 3:
			   display();
			    break;
		case 4:
			  System.exit(0);
			  break;
			  
		default: 
			   System.out.println("\n Invalid choice");
		}

	}
	}
	
	public static int push(int data,int stack[],int top)
	{
		int size=5;
		if(top==size-1)
		{
			System.out.println("\n Stack is full");
		}
		else
		{
			top++;
			stack[top]=data;
			
		}
		
	return data;	
	}
	 public static void  display()
	{
		
			
	}
		
		
	
		
		
	
}
