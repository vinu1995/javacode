package switchOperator;

public class BreakContinue {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)
		{
			if(i==7)
			{
				continue; //skip one iteration
			}
			System.out.println("value is "+i);
		}
		for(int j=1;j<=10;j++)
		{
			if(j==5)
			{
				break;  // breaks the entire loop
			}
			System.out.println("it is" +j);
		}
	} 

}
