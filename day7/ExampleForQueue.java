package day7;

import java.util.*;

public class ExampleForQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		System.out.println(pq);
		System.out.println("----------");
		System.out.println(pq.poll());//remove first element
		System.out.println("----------");
		for(Object i:pq) {
			System.out.println(i);
			
		}
	}

} 
