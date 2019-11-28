
public class TestH {


	 void first()
	{
		System.out.println("First method");
	}
	
	 void first(int a)
	{
		System.out.println("First method with parameter");
	}
	
	 
	 int first(int a,int b)
	 {
		 int c = 4;
		 return a;
	 }
	public static void main(String[] args) {
		
		
		TestH a = new TestH();
		a.first();
		a.first(10);
		
		TestH b;
	}
}
