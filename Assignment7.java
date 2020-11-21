//Program to display given character in opposite case
class Assignment7
{
	public static void main(String args[])
	{
		char ch=args[0].charAt(0);

		if(ch>='A' && ch<='Z')
		{
			System.out.print(ch+"->"+(Character.toLowerCase(ch)));
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.print(ch+"->"+(Character.toUpperCase(ch)));
		}
		else
		{
			System.out.print("Invalid Input");
		}
	}
}