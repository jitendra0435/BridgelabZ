
public class BubbleString {

	public static void main(String[] args) {
		String str[]= { "Ajeet", "Steve", "Rick", "Becky", "Mohan"};
		
		int i,j;
		 String temp;
		
		for(i=0;i<str.length;i++)
		{
			for(j=i+1;j<str.length;j++)
			{
				if(str[j].compareTo(str[i])<0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
					
					
					
				}
			}
			System.out.println(str[i]);
		}

		
	}

}
