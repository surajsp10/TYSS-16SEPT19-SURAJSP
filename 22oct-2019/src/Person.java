
public class Person {
	String name;
	int age;
	
	
	Person(String pname,int page){
		name = pname;
		age = page;
	}
	
	public static void main(String[] args) {
		Person p = new Person("divya",20);
		Person p1 = new Person("deepika",23);
		Person p2 = new Person("aishwarya",19);
	}
}
