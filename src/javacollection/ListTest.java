package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		 //List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
//		List<Student> slist = new ArrayList<>();
//		Student s1 = new Student();
//		s1.setFname("ram");
//		-----------
//		----------
//		  slist.add(s1);
		
		 list.add("nepal");
		 list.add("india");
		 list.add("canada");
		 list.add("china");
		 list.add("korea");
		 list.add("japan");
		 
		 //list.remove(3);
		 list.remove("india");
		 System.out.println(list.contains("china"));

		 for(String s : list) {
			 System.out.println(s);
		 }
		 
		 /*
		  * a> List of Student
		  * b> List of Product
		  * c> List of Employee
		  */
		 
		 
	}

}
