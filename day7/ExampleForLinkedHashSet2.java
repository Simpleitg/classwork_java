package day7;

import java.util.LinkedHashSet;

class Student {
	private String rollno;
	private String name;
	private String email;
	public Student(String rollno, String name, String email) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
	}
	public String getRollno() {
		return rollno;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}

	@Override
    public String toString() {
        return "Student [rollno= " + rollno + ",name=" + name+ ",email= " + email+"]";
    }
	
}
public class ExampleForLinkedHashSet2 {

	public static void main(String[] args) {
		Student s1 = new Student("A111","RAM","ram@gmail.com");
		Student s2= new Student("A112","Krish","krish@gmail.com");
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add(s1);
		lhs.add(s2);
		
		for(Object i:lhs) {
			System.out.println(lhs);
			
		}

	}

}
