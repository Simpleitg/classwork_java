package day7;

import java.util.TreeMap;
public class ExampleForTreeMap {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		tm.put("Name","Genius");
		tm.put("Age",24);
		tm.put("Email","Gen@gmail.com");
		
		System.out.println(tm);
		System.out.println("---------");
		//System.out.println(tm.get(0));
		//System.out.println("---------");
		for(Object obj : tm.keySet()) {
			System.out.println(obj);
		}
		System.out.println("----------");
		for(Object obj : tm.entrySet()) {
			System.out.println(obj);
		}
	}

}
