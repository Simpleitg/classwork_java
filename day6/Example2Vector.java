package day6;
import java.util.*;

class Car {
    private String name;
    private String color;
    
   public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

   public String getname() {
   return name;
	}
   
   public void setname(String name) {
		this.name = name;
   }
    
    public String getColor() {
	return color;
    }

   public void setColor(String color) {
	this.color = color;
   }


    @Override
    public String toString() {
        return "Car [name= " + name + ", Color= " + color+"]";
    }
}
public class Example2Vector {

	public static void main(String[] args) {
		Car c1 = new Car("BMW","Black");
		Car c2 = new Car("Honda","White");
		Vector v = new Vector();
		v.add(c1);
		v.add(c2);
		System.out.println(v);
		System.out.println(v);

	}

}
