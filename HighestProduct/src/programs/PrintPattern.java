package programs;

public class PrintPattern 
{
	public void printPattern(int num)
	{
		if(num<=0)
		{
			System.out.print(num+"...");
			return;
		}
		System.out.print(num+"...");
		printPattern(num-5);
		System.out.print(num+"...");
	}

}
