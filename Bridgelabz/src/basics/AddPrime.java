package basics;

public class AddPrime {

	public static void main(String[] args) {
		
		int Count=0;
		int sum=0;
		int number=2;
		while(Count<1000)
		{
			if(checkprime(number)==true)
			{
				sum=sum+number;
				
				Count++;
			}
			number++;		
		}
		System.out.println(sum);
	}
		
		public static boolean checkprime(int number)
		{
			
			for(int i=2;i<=number/2;i++)
			{
				
			
			if(number%i==0)
			{
				
				return false;
			}
			}
		return true;
	}
}
