package basics;

import java.util.Scanner;

public class Stackop {

	
	public static void main(String[] args)
	{
		
		int ch=0;
		Scanner sc=new Scanner(System.in);
		Stackoperation S1=new Stackoperation();
		System.out.println("\n 1:Push \n 2:Pop \n 3:Peak \n 4: Display \n 5: Exit");
    	System.out.println("\n Enter your choice:");
		ch=sc.nextInt();
		while(ch!=4)
		{
		
		switch(ch)
		{
		
		case 1:
			    S1.push();
			   break;
		case 2:
			   S1.pop();
			   break;
		case 3:
			  S1.peak();
			  break;
			  
		case 4:
			  S1.Display();
			  break;
		case 5:
			  System.exit(0);
			  break;
		default:
			System.out.println("Invalid Choice");
		}

	  }
   }
}

class Stackoperation
{
	int top;
	int size=5;
	int Stack[]=new int[size];
	
	
	Scanner sc=new Scanner(System.in);
	Stackoperation()
	{
		top=-1;
	}
	
	void push()
	{
		if(top==(size-1))
		{
			System.out.println("\n Stack is full");
		}
		else
			System.out.println("\n Enter Element");
		    int value=sc.nextInt();
		    
		    top++;
		    Stack[top]=value;
		    System.out.println("\n Item Pushed");
		    
		}
	void pop()
	{
		
	}
	void peak()
	{
		
	}
	void Display()
	{
		for(int i=top;i>0;i--)
		{
			System.out.println(Stack[i]);
		}
		
		
		
	}
	
}



