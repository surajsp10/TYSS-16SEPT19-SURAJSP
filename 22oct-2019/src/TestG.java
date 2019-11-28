
public class TestG {

	final void add() {
		System.out.println("ADD() method");
	}
	
	final void add(int a) {
		System.out.println("ADD(int a) method");
	}
	
	public static void main(String[] args) {
		
		
		SuperClass s = new SuperClass();
		
		System.out.println("++++++++++++++++++++");
		
		SubClass sub = new SubClass();
		
		sub.getSData();
		
		TestG d = new TestG();
		d.add();
		d.add(5) ;
	}
}
