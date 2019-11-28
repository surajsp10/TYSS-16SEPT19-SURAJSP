class Factorial
{
public static void main(String[] args)
	{
	int a = 10;
	int b = fact(a);
	System.out.println("The factorial is "+b);
	}
	static int fact(int x)
	{
		int d=1;
		for(int i=1;i<x;i++)
		d*=i;
		return d;
	}


}