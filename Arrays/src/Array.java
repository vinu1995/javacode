/* array is a collection of elements
 *  array index no is 0 i.e 0,1,2,3,....
 *  types of arrays 
 *  1.one dimensional
 *  2.two dimensional
 *  3.jagged array
 */

public class Array
{

	public static void main(String[] args)
	{
		// one dimensional array
		int nums[] = new int[5]; 
		nums[0] = 12;   // or we can give values like int nums[] = {2,4,6,8,12}
		nums[1] = 21;
		nums[2] = 78;
		nums[3] = 56;
		nums[4] = 34;
		
		System.out.println(nums[2]);
		
		for(int k=0;k<5;k++)
		{
			System.out.println(nums[k]);
		}
		// enhanced for loop
		for(int c : nums)
		{
			System.out.print(" "+ c);
		}
		System.out.println();
		
		// two dimensional array
		int a[][] = {           
				{2,4,5,7},
				{1,9,7,3},
				{5,7,8,1}
				};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(" "+ a[i][j]);
			}
			System.out.println();
		}
		// enhanced for loop
				for(int k[] : a )
				{
					for(int l : k )
					{
						System.out.print(" "+ l);
					}
					System.out.println();
					
				}  
		//jagged array 
		int b[][] = {           
				{2,4,5,7},
				{1,9,7},
				{5,7,8,1,2}
				};
		for(int m=0;m<b.length ;m++)
		{
			for(int n=0;n<b[m].length ;n++)
			{
				System.out.print(" "+ b[m][n]);
			}
			System.out.println();    
		}
		// enhanced for loop
		for(int k[] : b )
		{
			for(int i : k )
			{
				System.out.print(" "+ i);
			}
			System.out.println();
			
		}  
		
	}

}
