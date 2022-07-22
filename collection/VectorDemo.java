package collections;

import java.util.Iterator;

import java.util.Vector;



public class VectorDemo {

	

	public static void main(String[] args) {

		

		

		Vector<String> list= new Vector<String>();

		

		

		//Difference between array list and vector

		

		// 1. ArrayList is not synchronized but vector is synchronized

		// 2. array list is not legacy class. it was introduced in JDK12 but vector is legacy class

		// 3. ArrayList is fast because it is not synchronized but vector is slow because it is synchronised

		

		System.out.println("Size:"+list.size());

		

		list.add("Apple");

		list.add("Banana");

		list.add("Cherry");

		list.add("Apple");// duplicate value are allowed in list

		list.add(null);// list contains null value

		

		System.out.println("After Adding an Elements :"+list.size());

		System.out.println(list);

		

		System.out.println("Element at index 4: "+list.get(4));

		list.add("Pizza");

		

		System.out.println(list);

		

		System.out.println("List Contains Apple? :"+list.contains("Apple"));

		

		

		list.remove(0);

		list.remove(null);

		

		System.out.println(list);

		

		

		//print a list using for loop

		

		for(String s:list) {

			System.out.println("Using For Loop: "+s);

		}

		

		

		//iterate using iterator

		Iterator<String> itr= list.iterator();

		

		while(itr.hasNext()) {

			System.out.println("Using Iterator: "+itr.next());

		}

	

	}



}
