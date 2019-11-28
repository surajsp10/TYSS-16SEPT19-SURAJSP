//static blocks
public class TestA {

	
	static int a;
	int b;//instance variables cannot be declared in static blocks
	static {
		a=10;
		System.out.println("static block1");
	}
	
	public static void main(String[] args) {
		
		TestA t = new TestA();
		TestA t1 = new TestA();
		
		
		System.out.println("a value  "+a);
		
	}
	
	
	
	static {
		a=20;
		System.out.println("static block 2");
	}
	
	
	
	static {
		
		a=40;
		System.out.println("static block 3");
	}
	
	
	
}
