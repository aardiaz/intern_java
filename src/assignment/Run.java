package assignment;

public class Run {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
		e1.name = "Robert";
		e1.address= "Canada";
		e1.salary = 600000;
		e1.year_of_join = 2003;
		
		System.out.println("Name\tYearOfJoin\tSalary\tAddress");
		e1.printEmployee();
		
		
		Employee  e2 = new Employee();
		
		e2.name = "Ram";
		e2.salary = 300000;
		e2.address = "Nepal";
		e2.year_of_join = 2010;
		e2.printEmployee();
		
		
		
	}

}
