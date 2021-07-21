package switchOperator;

public class Loop
{
	public static void main(String[] args)
	{
		// while, do while, for, for-each
		int a = 1;   // initialization
		while(a<=6)
		{
			System.out.println("hello");
			a++;
		}
		
		int b=10; 
		do  // in this case statement is executed once if loop is false
		{
			System.out.println("hi");
			b++;
		}while (b<=6);
		
		for(int i=1;i<=8;i++)
		{
			System.out.println("vinu");
		}
		
		
	}
}
