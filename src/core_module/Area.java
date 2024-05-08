package core_module;

public class Area {
	
	public static void main(String[] args) {
		
		// area();
		// printTable(4565);
		int s = getSumOf1to100();
		System.out.println("Total sum = "+s);
	}
	
	static void area() {
		
		int  l = 500;
		int  b = 200;
		
		int area = l * b;
		System.out.println("Area = "+area);
	}
	
	//WAP to print table of given number using method
	static void  printTable(int n) {
		
		for(int i=1; i<=10; i++) {
			
			System.out.println(n+" x "+i+" = "+(n*i));
		}
		
	}
	
	// get sum of 100 numbers.
  static int  getSumOf1to100() {
		
		int s = 0;
		  
		for(int i=1; i<=100; i++) {
			
			s = s + i;
		}
		return s;
	}
	
	

}
