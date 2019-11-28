
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost=100;
		p.color = "green";
		p.brand = "Lamy";
		System.out.println("Cost is "+p.cost);
		System.out.println("Color is "+p.color);
		System.out.println("Brand is "+p.brand);
		
		p.write();
		
		System.out.println("*******************");
		
		Van v = new Van();
		v.cost = 500000;
		v.color = "white";
		
		
		Van v1 = new Van();
		v1.cost = 800000;
		v1.color = "green";
		
		System.out.println("the cost of van is "+v.cost+" the color of van is "+v.color);
		
		System.out.println("the cost of van is "+v1.cost+" the color of van is "+v1.color);
		v.move();
		

	}
}
