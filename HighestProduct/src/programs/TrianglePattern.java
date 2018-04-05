package programs;

public class TrianglePattern 
{
	public void trianglePattern(int number)
	{
		for(int i=1;i<=number;i++)
        {
            for(int sp=1;sp<=number-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
		
	}

}
