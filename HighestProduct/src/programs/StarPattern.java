package programs;

public class StarPattern 
{
	public void starPattern(int n)
	{
		if(n==1)
		{
			System.out.println("5");
			return;
		}
		System.out.print("1");
		starPattern(n-1);
		System.out.print("5");
		starPattern(n-1);
	}
	

}
