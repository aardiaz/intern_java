package ObjectWithArray;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		//store and print data of 5 dogs.
		
		//create array
		Dog  dogs[] =  new Dog[5];
		
		//write data in array
	
		  Scanner  sc = new Scanner(System.in);
		
		for(int i=0; i<dogs.length; i++) {
			
			 Dog  d = new Dog();
			 
			 System.out.println("Enter age ");
			 d.setAge(sc.nextInt());
			 
			 System.out.println("Enter Name ");
			 d.setName(sc.next());
			 
			 System.out.println("Enter color ");
			 d.setColor(sc.next());
			 
			 dogs[i] = d;
		}
		
		//read data from array
		int tp = 0;
		for(Dog  dk : dogs ) {
			if(dk.getColor().equals("black")) {
			     System.out.println(dk);
			     tp = tp + dk.getAge();
			}
		}
	}

}
