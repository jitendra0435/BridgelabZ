import java.util.Scanner;

class node
{
	int data;
	node link;	
}


public class Linklist
{
	 Scanner sc=new Scanner(System.in);
	 node head=null;
	 
  public static void main(String args[])
  {
	  
	  
	  Linklist l1=new Linklist();
	  l1.addfirst(10);
	  l1.addfirst(20);
	  l1.addfirst(30);
	  l1.addfirst(50);
	  l1.addfirst(40);
	  l1.display();
	 
	
 }
  
  void addfirst(int data)
  {
	  node newnode=new node();
	  node q;
	  System.out.println("\n enter data");
	  data=sc.nextInt();
	  newnode.link=null;
	  
	  if(head==null)
	  {
		  
		  head=newnode;
		  
	  }
	  else
	  {
		  q=head;
		  
		  while(q.link!=null)
		  {
			  
			  q=q.link;
			  
		  }  
		  q.link=newnode;
		  
	  }
}
  
  void display()
  {
	  
	  node Cnode=head;
	  System.out.println("List is:");
	  while(Cnode!=null)
	  {
		  System.out.print(Cnode.data+" ");
	  }
	  
	  
  }	
	
}
