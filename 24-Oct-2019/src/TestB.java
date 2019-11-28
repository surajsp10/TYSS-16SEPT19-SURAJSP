//non static block 
public class TestB {
	
	
	static int b;
	int a;
	{
		a=10;
		b=20;
		System.out.println("non static block1");
		
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Main started");
		
		TestB t = new TestB();
		
		TestB t1 = new TestB();
		
		
		System.out.println("Main Ended");
	}
	
	
	{
		System.out.println("Non static block2");
	}

}
