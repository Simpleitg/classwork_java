package day6;

import java.util.*;
public class ExampleLinkedList {

	public static void main(String[] args) {

		        LinkedList<Integer> list = new LinkedList<>();

		      
		        list.add(10);
		        list.add(20);
		        list.add(30);
		        System.out.println("After add: " + list);

		
		        list.addFirst(5);
		        list.addLast(40);
		        System.out.println("After addFirst & addLast: " + list);

		        
		        System.out.println("First element: " + list.getFirst());
		        System.out.println("Last element: " + list.getLast());
		        System.out.println("Element at index 2: " + list.get(2));

	
		        list.removeFirst();
		        list.removeLast();
		        list.remove(1);   // remove by index
		        System.out.println("After remove: " + list);

		       
		        System.out.println("Contains 20? " + list.contains(20));

		        
		        System.out.println("Size: " + list.size());

		        
		        list.set(0, 100);
		        System.out.println("After set: " + list);

		        
		        System.out.println("Is empty? " + list.isEmpty());

	
		        list.clear();
		        System.out.println("After clear: " + list);
		    }
		}


	}

}
