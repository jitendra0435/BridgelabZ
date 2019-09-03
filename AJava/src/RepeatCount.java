
public class RepeatCount {

	public static void main(String[] args) {
		
		int a[]= {20,10,30,50,40,10,20,30};
		int fr[];
		int i,j;
		int temp[]=new int[a.length];
		
		for(i=0;i<a.length;i++)
		{
			for(j=i+1;j<a.length-1;j++)
			{
				
				if(a[i]!=a[j])
				{
					
					temp[i++]=a[i];
					
				}
				else 
					a[j]='0';
			
				
			}
			
			
		}
		for(i=0;i<a.length;i++)
		{
			if(a[i]!='0')
			{
				System.out.println(temp[i]);
			}
		}
		

	}

}
