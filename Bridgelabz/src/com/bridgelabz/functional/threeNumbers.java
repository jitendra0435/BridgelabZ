
public class threeNumbers {

	public static void main(String[] args) 
	{
		int count=0;
		int a[]= {23,45,12,45,22,55,-4,5,-1};
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=1;j<=i;j++)
			{
				for(int k=0;k<=j;k++)
				{
					int n=a[i]+a[j]=a[k];
					while(n==0)
					{
						System.out.println("true "+a[i]+" "+a[j]+" "+a[k]);
						count++;
					}
					System.out.println("Number of addition:"+count);
		}
			}
		}
		// TODO Auto-generated method stub

	}

}
