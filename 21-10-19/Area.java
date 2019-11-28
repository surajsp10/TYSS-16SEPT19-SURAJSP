class Area
{
public static void main(String[] ar)
{
	
	double pi = 3.14;
	double r = 10;
	double a = area(pi,r);
	System.out.println("The area of circle "+a);
	double x = circum(pi,r);
	System.out.println("The circumference of circle is "+x); 
	boolean m=Oddeven(10);
	System.out.println("the number is even "+m);
}


	static double area(double a, double b)
	{
	double d = a*(b*b);
	return d;
	}

	static double circum(double a,double b)
	{
	double d = 2*a*b;
	return d;
	}

	static boolean Oddeven(int number)
	{
		if(number%2 ==0)
		 return true;
		else
		return false;
	}
		
}
