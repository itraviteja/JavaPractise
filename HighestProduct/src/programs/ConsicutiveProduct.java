package programs;

public class ConsicutiveProduct 
{
	public String ConProduct(String number,int lng)
	{
		int numeric = 0;
		String message=null;
		String no; 
        long product= 0;
        long X = 0; 
        int count=0;
        for ( int i=0; i < number.length()-(lng-1); i++)  
        {
       	 	X=1;
       	 	count=1;
       	 	no="";
       	 	for(int j=0; j<lng; j++)
       	 	{
       	 		if(X == 0)
                {
                    X = 1;
                }
                char c = number.charAt(i+j);
                no+=c;
                numeric = Character.getNumericValue(c);
                X=X*numeric;
                if(product<X)
                {
                	product=X;
               	 	if(count==lng)
               	 	{
               	 		message="the highest productductive number is"+no; 
               	 	}
                }count++;
            }
        }
        return message+" "+"productduct is "+product;
	}
}
