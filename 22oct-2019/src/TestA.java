
public class TestA {
	
	public static int add(int a,int b) {
		System.out.println("add(int a,int b) method");
		return a+b;
	}
	public static int add(int a,byte b) {
		System.out.println("add(int a,int b) method");
		return a+b;
	}
	
	public static long add(long a,int b) {
		System.out.println("add(int a,int b) method");
		return a+b;
	}
	
	public int multiply(int a,byte b)
	{
		System.out.println("multiply(int a,int b) method");
		return a*b;
	}
	
	public int multiply(int a,int b)
	{
		System.out.println("multiply(int a,int b) method");
		return a+b;
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		main(10);
		add(10, 12);
		add(23, 34);
		add(100, 56);
		
		
		TestA t = new TestA();
		
		t.multiply(12, 45);
		t.multiply(34, 78);
	}
}
