package sheet10;

public class PrimeAnagram {

	public static void main(String[] args) {
		 
		boolean prime = false;
		int num;
		int temp;
		for(num=1;num<=100;num++)
		{
			
			prime=true;
			
		}
		
		if(num>=2)
		{
			for(int i=2;i<=(num/2);i++)
			{
				
				if(num%i==0)
				{
					
					prime=false;
					
					
				}
				
				if(prime)
				{
					
				temp=num;
				int rev=0;
				int rem;
				while(temp!=0)
				{
					rem=temp%10;
					rev=rem+(rev*10);
					temp=temp/10;
					
					
				}
				
				
					
				}
				
			}
			
		}
			
		

	}

}
