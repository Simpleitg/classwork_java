package day7;
import java.util.*; 
public class ExampleForMap {

	public static void main(String[] args) {
		HashMap <String,String> hm = new HashMap<String,String>();
		hm.put("Name:","Genius");
		hm.put("Class:","Laboratory");
		System.out.println(hm);
		System.out.println("---------");
		System.out.println(hm.get("Class"));
		System.out.println("---------");
		for(Object i:hm.keySet()) {
			System.out.println("Keys:"+i);
		}
		System.out.println("------------");
		for(Object i:hm.values()) {
			System.out.println("values:"+i);
		}
		System.out.println("------------");
		for(Object i:hm.entrySet()) {
			System.out.println("Keys&Values:"+i);
		}
	}

}
