package collections;

import java.util.HashSet;



public class HashSetDemo {

	

	public static void main(String[] args) {

		//HashSet class implements set interface

		//no guarantee that the constant order of element over time

		//methods add, remove,contains and size;

		

		HashSet<Integer> set= new HashSet<Integer>();

		

		set.add(18);

		set.add(23);

		set.add(8);

		set.add(65);

		set.add(34);

		set.add(42);

		set.add(null);

		

		System.out.println("Size: "+set.size());

		

		System.out.println(set);

		

		System.out.println("Contains: "+ set.contains(8));

		

		set.remove(null);

		

		//iterate using for loop

		

		//iterate using iterator

	}


}