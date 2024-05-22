package controlstatements;

import java.util.Scanner;

public class IfTest {
	
	/*
	 * ------------- if ------------------
	 * # syntax :
	 * 
	 *    if(condition){
	 *      
	 *        //statements
	 *    }
	 */

	  public static void main(String[] args) {
		
		  int salary;
		  
		  //get data from keyboard
		  Scanner  sc = new Scanner(System.in);
		  
		  System.out.println("Enter your salary ");
		  salary = sc.nextInt();
		  
		  if(salary < 40000) {
		      salary = salary + 5000;
		  }
		  
		  System.out.println("Your salary = "+salary);
		  
		  /*
		   * Q1> WAP to print sum of two int values where value of a and b not zero
		   *      using scanner.
		   *      
		   *  Q2> WAP to find area of circle where value of r not zero.
		   *       using scanner.
		   *       
		   *  Q3> WAP to find SI where p,t,r not zero using scanner
		   * 
		   */
		  
	}
}
