
public class Fact {

	
	static int fact(int n)
	{
		if(n==0)
		{
			return 1;
			
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	

	public static void main(String[] args) {
		int a = fact(4);
		System.out.println("Factorial of the number is "+a);
	}
}
