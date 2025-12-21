package day7;
import java.util.*;
class Car implements Comparable<Car> 
{
	int cost;
	Car(int cost) {
		this.cost = cost;
	}
	
	@Override
	public String toString() {
		return "Car [cost=" + cost+ "]";	
	}
	@Override
	public int compareTo(Car c)
	{
		return this.cost-c.cost;
	}
		
}
public class ExampleForComparable {
	public static void main(String[] args) {
		Car c1 = new Car(300);
		Car c2 = new Car(200);
		Car c3 = new Car(100);
		TreeSet ts = new TreeSet();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		for(Object i : ts) {
			System.out.println(i);
		}

	}

}
