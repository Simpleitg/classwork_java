package day3;

class Demo {
	void div() throws Exception{
		int n1 = 20;
		int n2 = 0;
		System.out.println(n1/n2);
	}
}
class Example {

	public static void main(String[] args) {
		Demo d = new Demo();
		try {
			d.div();
		}
		catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}
		

	}

}
