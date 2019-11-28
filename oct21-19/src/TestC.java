
public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();//static methods and variables can be accessed using . operator and no object creation
		System.out.println("Person color "+Person.color);
		Person p = new Person();
		
		System.out.println("================");
		
		p.age = 20;
		p.name = "divya";
		System.out.println("Person of p age is "+p.age);
		System.out.println("Person of p name is "+p.name);
		Person.color = "black";
		Person.sleep();
		
		
		System.out.println("=============");
		
		p.age = 30;
		p.name = "kavya";
		System.out.println("Person age is "+p.age);
		System.out.println("Person name is "+p.name);
		Person.color = "white";
		Person.sleep();
	}
}
