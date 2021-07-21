package switchOperator;

public class Operator 
{
	public static void main(String[] args)
	{
		// ternary operator => condition is ?:
//if condition?right expr1 executed,, if condition:wrong expr2 executed		
		
		int i=4;
		int j=0;
		
		j = (i>8)?23:97; // ternary operator
		System.out.println(j);
		
		// switch operator
		
		int n = 5;
		switch(n)
		{
		case 1:
			System.out.println("one");  //int, char can be executed 
			break;            //string used only in 1.7 and later
		case 2:                 // dopuble cannot be used in switch
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
			default:
				System.out.println("no match");
		}
		
		
		
		
		
}
}