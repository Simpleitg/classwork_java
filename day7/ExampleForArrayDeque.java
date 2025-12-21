package day7;
import java.util.ArrayDeque;
import java.util.Deque;
public class ExampleForArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> d = new ArrayDeque<Integer>();
		d.add(10);
		d.add(20);
		d.add(30);
		System.out.println(d);
		System.out.println("----------");
		System.out.println(d.poll());//remove first element
		System.out.println("----------");
		for(Object i:d) {
			System.out.println(i);
			
		}
		System.out.println("----------");
		System.out.println(d.remove(20));
		System.out.println("-----------");
		System.out.println(d);
		
	}

}
