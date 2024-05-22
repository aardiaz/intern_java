package javacollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String[] args) {
		
		//Set<String>  set = new HashSet<>();
		//Set<String>  set = new TreeSet<>();
		Set<String>  set = new LinkedHashSet<>();
		
		set.add("ram");
		set.add("hari");
		set.add("ram");
		set.add("kamal");
		set.add("john");
		set.add("kamal");
		set.add("rupa");
		set.add("anup");
		
		for(String s : set) {
			System.out.println(s);
		}
		
		/*
		 * a> set of Dog
		 * b> set of Book
		 * c> set of Laptop
		 */
	}

}
