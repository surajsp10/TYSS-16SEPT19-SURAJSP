package com.testyantra.arrays;
//Even objects can be passed
public class TestC {

	
	
	
	public static void main(String[] args) {
		
		
		Student s1 = new Student(12, "namitha", 78.56);
		Student s2 = new Student(13, "sarika", 79.56);
		Student s3 = new Student(14, "chandr4ika", 80.56);
		
		
		Student[] students =  new Student[3];
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		for(Student s : students) {
			
			System.out.println(s);
		}
		
		
		}
	
	static void receive(Student[] stu) {
		
		
		for(Student s :stu) {
			System.out.println(s);
		}
		
	}
}
