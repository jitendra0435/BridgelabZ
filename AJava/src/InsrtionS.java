
public class InsrtionS {

	public static void main(String[] args) {
		String str[]={"Ajeet", "Steve", "Rick", "Becky", "Mohan"};
		
		int i,j;
		String temp;
		
		for(i=1;i<str.length;i++)
		{
			temp=str[i];
			j=i;
			while(j>0 && str[j-1].compareTo(temp)>0)
			{
				str[j]=str[j-1];
				j--;
				
			}
			str[j]=temp;
			
			
		}
		

		for(i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		

	}

}
