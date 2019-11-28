
public class TestI {

	
	
	public static void main(String[] args) {
		
		Automobile a;//reference variable can be created for interface and abstract class
		
		
		BMW b = new BMW();
		b.gear();
		b.gps();
		
		
		System.out.println("_________________");
		
		Toyota t = new Toyota();
		t.gear();
		t.gps();
		
		System.out.println("__________________");
	}
}
