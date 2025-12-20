package day5;

class Sqrno extends Thread{
	public void run()
	{
		System.out.println("Squares of numbers in the array:");
		int arr[] = {1,20,50,15,30};
		for(int num:arr)
		{
			System.out.println("Square of"+num+":"+num*num);
			try {
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Prob");
			}
		}
	}
}
class Avg extends Thread{
	public void run() {
		float total = 0;
		for(int i=0;i<=10;i++)
		{
			total+=i;
			try {
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println("Problem in average!");
			}
			
		}System.out.println("Average of first 10 Natural Numbers are:"+total/10);
	}
}

public class example {

	public static void main(String[] args) {
		Sqrno s = new Sqrno();
		Avg a = new Avg();
		Thread t1 = new Thread(s);
		
		Thread t2 = new Thread(a);
		t1.start();
		t2.start();
		
		
		
		
		

	}

}
