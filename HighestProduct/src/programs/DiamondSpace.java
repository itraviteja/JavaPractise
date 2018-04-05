package programs;

public class DiamondSpace 
{
	public void diamondSpace(int n)
	{
        int space=(2*n)-1;
        for(int i=1;i<=2*n-1;i++)
        {
        	if(n>=i)
        	{
        	for(int j=1;j<=n-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int j=1;j<=2*i-1;j++)
        	{
        		if(j%2!=0)
        		{
        			System.out.print("*");
        		}
        		else
        			System.out.print(" ");
        	}
        	System.out.println();
        	}
        	else
        	{
        		for(int j=1;j<=i-n;j++)
            	{
            		System.out.print(" ");
            	}
        		for(int j=1;j<=2*(space-i)+1;j++)
        		{
        			if(j%2!=0)
        			{
        				System.out.print("*");
        			}

            		else
            			System.out.print(" ");
        		}System.out.println();
        	}
        		
        }
	}

}
