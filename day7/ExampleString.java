package day7;

public class ExampleString {

	public static void main(String[] args) {
		String s = new String("Tej");//String is Immutable 
		System.out.println(s);
		s.concat("Genius");
		System.out.println(s);
		System.out.println("---------");
		StringBuffer sbu = new StringBuffer("Tej");
		System.out.println(sbu);
		sbu .append("Genius");
		System.out.println(sbu);
		System.out.println("---------");
		StringBuilder sb = new StringBuilder("Tej");
		System.out.println(sb);
		sb.append("Genius");
		System.out.println(sb);
	}

}
