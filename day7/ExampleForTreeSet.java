package day7;
import java.util.*;
public class ExampleForTreeSet {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		HashSet<String> hs = new HashSet<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		ts.add(111);
		ts.add(999);
		ts.add(666);
		hs.add("Tej");
		hs.add("Nikh");
		hs.add("Apple");
		hs.add("Apple");
		lhs.add("Termin");
		lhs.add("Android");
		lhs.add("Nothing");
		lhs.add("Android");
		System.out.println(ts);
		System.out.println(hs);
		System.out.println(lhs);
		

	}

}
