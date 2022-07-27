package collections;

import java.util.LinkedList;



public class LinkedListDemo {

	

	

	public static void main(String[] args) {

		

		//linked list is a part of the collection framework present in jav.utilpackage

		//it is linear restructure where elements are not stored in contiguous memory location

		//every element is spate object with DataPart and address

		//this elements are linked using pointer and address

		// each element is called node

		//due to dynamically insertion and deletion they are much more preferred than arrays

		

		LinkedList<Integer> list= new LinkedList<Integer>();

		

		list.add(56);

		list.add(67);

		list.add(89);

		list.add(13);

		

		System.out.println("Size: "+list.size());

		System.out.println(list);

		

		list.remove(3);

		

		System.out.println(list);

		

		System.out.println("Element 2: "+list.get(2));

		list.add(2,0);

		

		System.out.println(list);

		

		System.out.println("First Element: "+list.getFirst());

		

		System.out.println("Last Element: "+list.getLast());

		

		

		//you can iterate using for loop

		//you can iterate using iterator

		

	}



}
