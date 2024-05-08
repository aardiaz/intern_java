package array;

import java.util.Scanner;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//wap to store and print age of 5 students.
		
		//1. create array
		
		 int  age[]  =  new  int[5];
		
		//2. write data in array
		 
		 Scanner  sc = new Scanner(System.in);
		 
		 for(int i=0; i<age.length; i++) {
			 
			 System.out.println("Enter your age ");
		     age[i] =  sc.nextInt();
		 }
		
		//3. read data from array
		int s = 0;
		 
		 for(int x : age) {
			 System.out.println(x);
			 s+=x;
		 }
		 
		 System.out.println("Total age = "+s);
	}

}
