class TestA
{
	public static void main(String[ ] ar)
	{
	int a=10;
	int b=20;
	int c = a++ + b; //post increment
	System.out.println("the value of c is"+c);


	int d = 20;
	int e = 30;
	int f = ++d+e;
	System.out.println("the value of f is"+f);
	}
}