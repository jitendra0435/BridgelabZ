package sheet10;

public class TwoDArray {

	public static void main(String[] args) {
	
		int A[][]= {{1,2,3,4},{5,6,7,8}};

		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[i].length;j++)
			{
				System.out.println(A[i][j]);
			}
		}
	}

}
