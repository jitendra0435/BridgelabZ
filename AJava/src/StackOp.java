import java.util.Scanner;

class OP
{ 
	int size=5;
	int a[]=new int[size];
	int top;
	int data;
	OP()
	{
		top=-1;
	}
	
	 void Push()
	{
		if(isFull()==true)
		{
			System.out.println("\n Overflow");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("\n Enter data->");
			data=sc.nextInt();
			top++;
			a[top]=data;
			
		}
		
		
	}
	 void pop()
	 {
		 if(isEmpty()==true)
		 {
			 System.out.println("\n Underflow");
		 }
		 else
			
		     System.out.println("Item poped:>" +a[top]);
		     top--;
		 
		 
	 }
	void display()
	{
    System.out.println("Elemet are->");
	for(int i=top;i>=0;i--)
	{
		System.out.println(+a[i]);
	}
	}
	boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else
			return false;
		
	}
	boolean isFull()
	{
		if(top==size-1)
		{
			
			return true;
			
		}
		else
			return false;
		
	}
	
}


public class StackOp {

	public static void main(String[] args) {
	  OP O1=new OP();
	   O1.Push();
	   O1.Push();
	   O1.Push();
	   O1.Push();
	   O1.pop();
	   O1.pop();
	   O1.pop();
	   O1.pop();
	   O1.pop();
	   O1.display();

	}

}
