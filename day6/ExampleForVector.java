package day6;

import java.util.Vector;

public class ExampleForVector {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Genius");
		v.add("Neem");
		v.add("Dance");
		v.add("Java");
		System.out.println(v);
		System.out.println(v.get(1));
		System.out.println(v.isEmpty());
		System.out.println(v.contains(2));
		System.out.println(v.size());
		System.out.println("Vector class is stored in the class:\t"+v.getClass());
		Object a = 	v.clone();
		System.out.println("Cloned:"+a);
		for(Object i:v) {
			System.out.println(i);
		}
	}

}
