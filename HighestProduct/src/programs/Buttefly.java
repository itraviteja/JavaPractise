package programs;

public class Buttefly 
{
	public void butterfly(int number)
	{
		 int space=2*number-1,star=0;
	        for(int i=1;i<2*number-1;i++)
	        {
	        	if(i<number)
	        	{
	        		space=space-2;
	        		star++;
	        	}
	        	else
	        	{
	        		space=space+2;
	        		star--;
	        	}
	        	for(int j=1;j<star;j++)
	        	{
	        		System.out.print("*");
	        	}
	        	for(int k=1;k<space;k++)
	        	{
	        		System.out.print(" ");
	        	}
	        	for(int l=1;l<star;l++)
	        	{
	        		if(l!=number)
	        		System.out.print("*");
	        	}System.out.println("");
	        }

		
	}

}
