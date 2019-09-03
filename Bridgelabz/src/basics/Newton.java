package basics;

public class Newton {

	public static void main(String[] args)
	{
	 Newton n1=new Newton();
	 n1.sqrtDubious();

	}
	public static void sqrtDubious()
	{
		double c=100;
		if (c > 0)
		{
		double epp= 1e-15;
		double t = c;
		
	    while (Math.abs(t - c/t) > epp)  // is the absolute diff almost 0?
	        t = (c/t + t) / 2.0;
	   System.out.println(t);
		}
}
}
