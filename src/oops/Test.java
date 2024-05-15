package oops;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		//Math book
		
		Scanner sc = new Scanner(System.in);
		
		Book b = new Book();
		
		System.out.println("Enter id ");
		b.id = sc.nextInt();

		b.name = "Math";
		b.author = "CM.JOshi";
		b.price = 5000;
		
		b.printBook();
		
	}

}
