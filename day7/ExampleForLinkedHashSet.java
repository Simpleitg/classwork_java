package day7;
import java.util.LinkedHashSet;
public class ExampleForLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(10);
		lhs.add(20);
		lhs.add(10);//doesnot allow duplicates,and preserved in order of strings.
		System.out.println(lhs);
		for(Object i:lhs) {
			System.out.println(i);
		}
	}

}
