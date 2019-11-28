
public class Student {

	String name;
	int rollno;
	final String cname = "Qspiders";
	final int cid;
	
	
	Student(String name,int rollno,int cid){
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
		
		
	}
	
	Student()
	{
		this.cid = 200;
	}
	final void printDetails() {
		
		
		System.out.println("Hi " + name + "WELCOME TO" + cname);
	}
	
	
	final void printDetails(String name) {
		
		System.out.println("Hi" + name + "Welcome to" + cname);
		
	}
}
