
public class TestC {

	
	TestC(){
		System.out.println("TestC constructor");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		TestC t = new TestC();//the constructor will only be executed when the object is created
//constructor cannot be called explicitly 
		System.out.println("main ended");
	}
}
