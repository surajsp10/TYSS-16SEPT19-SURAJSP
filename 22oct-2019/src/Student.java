
public class Student {
	String name;
	int usn;
	String branch;
	long mobileno;
	String email;
	
	public Student(String name,int usn,String branch,long mobileno,String email) {
		this.name = name;
		this.usn = usn;
		this.branch = branch;
		this.mobileno = mobileno;
		this.email = email;
	}
	void printDetails(){
		System.out.println("Student name is  "+name);
		System.out.println("Student usn is  " +usn);
		System.out.println("Student branch is "+branch);
		System.out.println("Student mobileno is "+mobileno);
		System.out.println("Student email is  "+email);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello "+name+"  Welcome to TestYAntra  "+ usn);
	}
	public static void main(String[] args) {
		Student e1 = new Student("rashmika",143,"cs",5796479,"rash@gmail");
		e1.printDetails();
		System.out.println("-----------------------------");
		Student e2 = new Student("mansi",420,"cs",343253245,"man@gmail");
		e2.printDetails();

		System.out.println("-----------------------------");
		Student e3 = new Student("chacha",69,"cs",2354325,"cha@gmail.com");
		e3.printDetails();
		System.out.println("-----------------------------");
		Student e4 = new Student("chanchala",6,"cs",24344325,"chan@gmail.com");
		e4.printDetails();
		
		System.out.println("-----------------------------");
		Student e5 = new Student("chaitra",7,"ec",5654325,"chai@gmail.com");
		e5.printDetails();
		
		System.out.println("-----------------------------");
		Student e6 = new Student("disha",9,"cs",2334325,"disha@gmail.com");
		e6.printDetails();
		System.out.println("-----------------------------");
		Student e7 = new Student("kiara",10,"cs",2348925,"kia@gmail.com");
		e7.printDetails();

		System.out.println("-----------------------------");
		Student e8 = new Student("nidhi",1,"cs",557834325,"nidhi@gmail.com");
		e8.printDetails();
		System.out.println("-----------------------------");
		Student e9 = new Student("ramya",56,"cs",7354325,"ramya@gmail.com");
		e9.printDetails();
		System.out.println("-----------------------------");
		Student e10 = new Student("ashika",66,"cs",8945325,"ashika@gmail.com");
		e10.printDetails();


		
		
	}
}
