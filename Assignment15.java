//Program to print * in floyds format
class Assignment15
{
	public static void main(String args[])
	{
		if(args.length==0)
		{
			System.out.print("Please enter an integer number");
		}
		else
		{
			int num=Integer.parseInt(args[0]);
			for(int row=1;row<=num;row++)
			{
				int col=1;
				while(col<=row)
				{
					System.out.print("*");
					col++;
				}
				System.out.println();
			}
		}
	}
}