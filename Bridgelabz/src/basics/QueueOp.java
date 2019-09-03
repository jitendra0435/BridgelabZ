package basics;

import java.util.Scanner;

class Op
{
	int size=5;
    int a[]=new int[size];
    int front,rear;
    Scanner sc=new Scanner(System.in);
    int value;
    Op()
    {
    	front=-1;
    	rear=front;
    }
   void enqueue()
  {
	  if(isfull(rear,size)==true)
	  {
		  System.out.println("\n Overflow"); 
	  }
	  else
	  {
		  System.out.println("\n Enter element to insert");
          value=sc.nextInt();
          rear++;
          a[rear]=value;
          
	  }
   }
   
   void Dequeue()
   {
	   
	   if(isempty(front,rear)==true)
	   {
		   System.out.println("\n underflow");
	   }
	   else
	   {
		   for(int i=0;i<size;i++)
		   {
			   a[i]=a[i+1];
		   }
		   rear--;
		   
	   }
	   
   }
   void display()
   {
	   System.out.println("\n Queue Elements are->");
	   for(int i=rear;i<front;i++)
	   {
		   
		   System.out.println("\n "+a[rear]);
		   
	   }
	   
	   
	   
   }
   public static boolean isempty(int front,int rear)
   {
	   if(front==rear)
	   {
		  
		  return true; 
	   }
	   else 
		   return false;
	   
	   
   }
public static boolean isfull(int rear,int size)
{
	if(rear==size-1)
	{
		
		return true;
		
	}
	else
		return false;
	
}
	
	
	
}




public class QueueOp
{
	
	public static void main(String[] args) 
	{
		Op p1=new Op();
		p1.enqueue();
		p1.enqueue();
		p1.enqueue();
		p1.enqueue();
		p1.enqueue();
		p1.enqueue();
		p1.Dequeue();
		p1.Dequeue();
		p1.display();
	}

}
