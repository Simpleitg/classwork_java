package day4;
import java.util.Scanner;

class Addition extends Thread
{
	public void run()
	{
		System.out.println("Addition");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First No");
		int a = s.nextInt();
		System.out.println("Enter Seconnd No");
		int b = s.nextInt();
		int sum = a+b;
		System.out.println(sum);
		System.out.println("Addition Task Completed....");
		System.out.println("---------------------------------------");
	}
}

		
		
class CharacterPrinting extends Thread
{
	public void run()
	{
		System.out.println("Character printing started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

class NumberPrinting extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

public class ExampleForMultithreding {
	public static void main(String[] args) {
		
		Addition a = new Addition();
		CharacterPrinting c = new CharacterPrinting();
		NumberPrinting n = new NumberPrinting();
		
		a.run();
		c.run();
		n.run();
		
	}
		
	
}

	
		
	
		

	


