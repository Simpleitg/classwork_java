package day6;
import java.util.*;
public class ExampleForListandArrayList {

	public static void main(String[] args) {
		List l = new ArrayList();
				
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

	}

}
