//Program to print sum of all digits of given number
class Assignment14
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int sum;
		int rem=0;
		for (sum=0;num>0;num=num/10)
		{
			rem=num%10;
			sum=sum+rem;
		}
		System.out.print(sum);
	}
}