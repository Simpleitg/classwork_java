package day7;
import java.util.*;

class NameComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class RollNumberComparator implements Comparator<Student1> {
    @Override
    public int compare(Student1 s1, Student1 s2) {
        return s1.getRollno().compareTo(s2.getRollno());
    }
}

class Student1 {
    private String name;
    private String rollno;

    @Override
    public String toString() {
        return "Student1 [name=" + name + ", rollno=" + rollno + "]";
    }

    public Student1(String name, String rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }
}

public class ExampleForComparator {
    public static void main(String[] args) {
        Student1 s1 = new Student1("Tech", "SA4");
        Student1 s2 = new Student1("Quantum", "SA5");
        Student1 s3 = new Student1("Tarnado", "SA8");

        ArrayList<Student1> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        // Sort by roll number
        Collections.sort(al, new RollNumberComparator());
        System.out.println("Sorted by Roll Number:");
        for (Student1 i : al) {
            System.out.println(i);
        }

        // Sort by name
        Collections.sort(al, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student1 i : al) {
            System.out.println(i);
        }
    }
}