
public class TestB {
	int a=25;
	static TestB t;//static reference variable
	int x;
	public static void add() {
		int a ;
		final int b; //only final is supported for local variable
		a=10; //local variables are given first preference
		b=20;
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		add();
		TestB t = new TestB();
		System.out.println("x value is   "+t.x);
	}
}
