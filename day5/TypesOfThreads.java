package day5;

class Demo1 extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++) {
			System.out.println("User Thred is executing");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println("Something problem occured!");
			}
				
		}
	}
}
class Demo2 extends Thread
{
	public void run() {
		for(int i=0;i<=20;i++)
		{
			System.out.println("Daemon Thread is Executing!");
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Some problem occured!");
			}
		}
	}
}
public class TypesOfThreads {

	public static void main(String[] args) {
		System.out.println("Main() started Executing");
		Demo1 d1 = new Demo1();
		Demo2 d2 = new Demo2();
		d2.setDaemon(true);
		d1.start();
		d2.start();
		System.out.println("Main() stopped Executing");
	}

}
