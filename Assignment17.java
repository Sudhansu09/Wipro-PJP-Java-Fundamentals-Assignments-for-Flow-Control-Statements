//Program to check given number is palindrome or not
class Assignment17
{
	public static void main(String args[])
	{
		int num=Integer.parseInt(args[0]);
		int temp=num;
		int reverse=0;
		while(num!=0)
		{
			int digit=num%10;
			reverse=reverse*10+digit;
			num=num/10;
		}
		if(reverse==temp)
		{
			System.out.print(temp+" is a palindrome");
		}
		else
		{
			System.out.print(temp+" is not a palindrome");
		}
	}
}