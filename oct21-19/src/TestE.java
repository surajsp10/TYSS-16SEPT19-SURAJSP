
public class TestE {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student.cname = "Qspiders";
		s1.name = "priya";
		s1.usn = 101;
		System.out.println("College name is"+Student.cname);
		System.out.println("Name is "+s1.name);
		System.out.println("Usn  number is"+s1.usn);
		
		
	}
}
