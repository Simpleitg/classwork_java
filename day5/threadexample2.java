package day5;

class Restaurent extends Thread
{
	
    synchronized public void foodOrder(String orderName)
	{
    		String name = Thread.currentThread().getName();
    		System.out.println("Thread"+name+"Customer has placed the Order!"+orderName);
    		try {
    			wait();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		System.out.println("Thread"+name+"Placed the Order!");
	}
    synchronized public void cookedOrder(String orderName)
	{
    		String name = Thread.currentThread().getName();
    		System.out.println("Thread"+name+"Food is being prepared!"+orderName);
    		System.out.println("Thread"+name+"cooking is under progress");
    		try {
    			Thread.sleep(2000);
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		System.out.println("Thread"+name+"order is Ready!");
    		notifyAll();
	}
    synchronized public void receivedOrder(String orderName)
	{
    		String name = Thread.currentThread().getName();
    		System.out.println("Thread"+name+"customer is choosing an order:");
    		try {
    			wait();
    		}
    		catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    		System.out.println("Thread"+name+"customer has received the order!"+orderName);
	}
    
}
public class threadexample2 {

	public static void main(String[] args) {
		Restaurent r = new Restaurent();
		String orderName = "RED";
		new Thread("Customer") 
		{
			public void run()
			{
				r.receivedOrder(orderName);
			}
		}.start();
		new Thread("Waiter") 
		{
			public void run()
			{
				r.foodOrder(orderName);
			}
		}.start();
		new Thread("Chef") 
		{
			public void run()
			{
				r.cookedOrder(orderName);
			}
		}.start();
		
		//res.customer();
		//res.waiter();
		//res.cook();
		

	}

}
