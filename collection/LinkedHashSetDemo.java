package collections;




import java.util.LinkedHashSet;

public class LinkedHashSetDemo {



	
	

	public static void main(String[] args) {

		//linked HashSet is an ordered version of HashSet

		//whenever iteration order is needed to be maintained this class is used

		//while iterating elements are fetched as per they were inserted

		//do not allows duplicate values

		LinkedHashSet<String> linkedset= new LinkedHashSet<String>();

		

		linkedset.add("T");

		linkedset.add("A");

		linkedset.add("M");

		linkedset.add("I");

		

		//note: do not allows duplicate values, so 'A' will not be added but 'E' will be added

		linkedset.add("Z");

		linkedset.add("H");

		linkedset.add(null);

		

		System.out.println("Size: "+linkedset.size());

		

		System.out.println(linkedset);

		

		

		System.out.println("Contains E: "+linkedset.contains("Z"));

		

		linkedset.remove(null);

		

		System.out.println("After Remove: "+linkedset);

		

		// you can iterate using for loop

		

		// you can iterate using iterator

	}



}
