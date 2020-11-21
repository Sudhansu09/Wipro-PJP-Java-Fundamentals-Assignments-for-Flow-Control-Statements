//Program to print given number is prime or not
class Assignment12
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);

		boolean isPrime=true;
		int temp;
		for(int i=2;i<=num/2;i++)
		{
       		temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
	 	if (isPrime)
	 	{
	    	System.out.print("Prime Number");
	    }
	    else
	    {
	    	System.out.print("Not a Prime Number");
	    }
	}
}