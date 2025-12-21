package day7;
import java.util.LinkedHashMap;
public class ExampleForLinkeedHashMap {

	public static void main(String[] args) {
		LinkedHashMap m = new LinkedHashMap();
		m.put("Name","ABC");
		m.put("Age", 21);
		System.out.println(m);
		System.out.println("------------");
		System.out.println(m.get(0));
		System.out.println("------------");
		for(Object i:m.keySet()) {
			System.out.println("Keys:"+i);
		}
		for(Object i:m.entrySet()) {
			System.out.println("Keys and Values:"+i);
		}
	}

}
