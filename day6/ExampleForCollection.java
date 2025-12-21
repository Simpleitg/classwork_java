 package day6;

import java.util.List;
import java.util.ArrayList;
 //import java.util.*;

 class Student {
     private String Name;
     private int Age;

     // Constructor
     public Student(String name, int age) {
         this.Name = name;
         this.Age = age;
     }

     // Getters and Setters
     public String getName() {
         return Name;
     }
     public void setName(String name) {
         this.Name = name;
     }
     public int getAge() {
         return Age;
     }
     public void setAge(int age) {
         this.Age = age;
     }

     @Override
     public String toString() {
         return "Name: " + Name + ", Age: " + Age;
     }
 }

 public class ExampleForCollection {
	 
     public static void main(String[] args) {
     
    	 	Student s1 = new Student("Genius", 17);
    	 	Student s2 = new Student("Tej", 18);

    	 	ArrayList al = new ArrayList();
    	 	al.add(s1);
    	 	al.add(s2);
    	 	for(Object i :al) {
    	 		System.out.println(i);
    	 	}
    	 	
     }
 }
 		
 /*//rightside object
		List l2 = new Vector();
		List l3 = new Stack();
		List l4 = new LinkedList();*/
		//List l = new ArrayList();
		/*
		l.add(500);
		l.add(20);
		l.add(30);
		System.out.println("List collection:");
		System.out.println(l);
		System.out.println(l.iterator());
		System.out.println("First Indext Element in the List:"+l.get(1));
		System.out.println("List Built-in Extention:\t"+l.getClass());
		System.out.println("List-Size:"+l.size());
		System.out.println(l.contains(50));
		System.out.println("First Index-Element in the List"+l.getFirst());
		System.out.println("Last Index-Element in the List"+l.getLast());
		System.out.println("---------------");
		
		for(Object i : l) {
			System.out.println("for-each Loop in the List:"+i);
		}
		System.out.println("-------------");
		ArrayList al = new ArrayList();
		al.add(40);
		al.add(50);
		al.add(80);
		System.out.println("ArrayList collection:");
		System.out.println(al);
		System.out.println("------------");
		for(Object i : al) {
			System.out.println("for-each Loop in the List:"+i);
		}
		*/
		
		

	


 