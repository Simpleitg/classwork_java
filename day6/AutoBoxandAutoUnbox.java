package day6;

public class AutoBoxandAutoUnbox {

	public static void main(String[] args) {
		//dipresiation
		    int a = 10;          // primitive type
	        Integer b = a;       // AUTOboxing (int → Integer)

	        Integer c = 20;      // wrapper class
	        int d = c;           // AUTO-unboxing (Integer → int)

	        System.out.println(a);
	        System.out.println(b);
	        System.out.println(c);
	        System.out.println(d);
	}
}
