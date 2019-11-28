
public class TestG {
	public static void main(String[] args) {
		
		
		FirstGen a =new FirstGen();
		a.call();
		a.msg();
		
		System.out.println("*******************");
		
		SecondGen b = new SecondGen();
		b.call();
		b.msg();
		b.games();
	
		System.out.println("*******************");
		
		ThirdGen c = new ThirdGen();
		c.call();
		c.msg();
		c.games();
		c.camera();
	}
}
