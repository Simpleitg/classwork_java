package day5;

class Printer implements Runnable
{
	/*synchronized*/ public void run()
	{
		String name = Thread.currentThread().getName();
		System.out.println("Printing Started:"+name);
		for(int i=0;i<=5;i++)
		{
			synchronized(this) {
			System.out.println(name + "Printing");
			}
			try {
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
				System.out.println("Something problem occured!");
			}
		}
	}
}
public class DisadvantageOfThread {

	public static void main(String[] args) {
		
		Printer p = new Printer();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		Thread t3  = new Thread(p);
		
		t1.setName("Nikhil");
		t2.setName("Tej");
		t3.setName("Genius");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
