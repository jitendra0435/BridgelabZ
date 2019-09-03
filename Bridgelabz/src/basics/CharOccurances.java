package basics;

public class CharOccurances {

	public static void main(String[] args) 
	{
		String str="hello world";
		int fr[]=new int[str.length()];
		int i,j;
		
		char ch[]=str.toCharArray();
		
		for(i=0;i<str.length();i++)
		{
			fr[i]=1;
			for(j=i+1;j<str.length();j++)
			{
				if(ch[i]==ch[j])
				{
					
					fr[i]++;
					
					ch[j]='0';
					
				}
			}
		
		}
           for(i=0;i<fr.length;i++)
           {
        	   
        	   if(ch[i]!=' '&&ch[i]!='0')
        	   {
        		   System.out.println(ch[i]+"->"+fr[i]);
        	   }
        	   
           }
		
	}

}
