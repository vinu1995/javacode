 // Variable length arguments
class Calc
{
public int add(int ... n)   // array of nums
	{
	int sum=0;
	for(int i : n)
	{
		sum = sum + i;
	}
	return sum;
	}
}
public class VarargsDemo
{
	public static void main(String[] args) 
	{
		Calc obj = new Calc();
		System.out.println(obj.add(2,3,4,5,6,7,8,9));
	}

}
