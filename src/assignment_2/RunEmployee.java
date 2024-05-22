package assignment_2;

import java.util.Scanner;

public class RunEmployee {
	
	public static void main(String[] args) {
		
		Employee[] employees = getArrayOfEmployee();
		
		displayEmployeeData(employees);
		
		// a.Total salary
		calculateTotalSalary(employees);
		
		//printing employess of IT department
		printEmployeesByDepartment(employees);
		
		//conting the admin department
		countEmpsByDepartment(employees);
		
		//counting and printing a particular city's employes
		countEmpsByCity(employees);
		
		//Total Salary of particular department
		findTotalSalaryByDept(employees);
		
		//finding lowest salary of the employees
		findLowestSalary(employees);
		
		//finding the highenst salary of the employess
		findHeighestSalary(employees);	
	}

	private static Employee[] getArrayOfEmployee() {
		Employee[] employees = new Employee[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<employees.length; i++) {
			Employee e = new Employee();
			System.out.println("Enter the Id");
			e.setId(sc.nextInt());
			
			System.out.println("Enter the Name");
			e.setName(sc.next());
			
			System.out.println("Enter the Company");
			e.setCompany(sc.next());
			
			System.out.println("Enter the Salary");
			e.setSalary(sc.nextDouble());
			
			System.out.println("Enter the Department");
			e.setDepartment(sc.next());
			
			System.out.println("Enter the Post");
			e.setPost(sc.next());
			
			System.out.println("Enter the City\n");
			e.setCity(sc.next());
			
			employees[i] = e;
		}
		sc.close();
		
		return employees;
	}

	private static void displayEmployeeData(Employee[] employees) {
		for(Employee emp : employees) {
			System.out.println(emp.toString());
		}
	}

	private static void findHeighestSalary(Employee[] employees) {
		double maxSalary = employees[0].getSalary();  
		for(Employee emp : employees) {
			if(maxSalary <= emp.getSalary()) {
				maxSalary = emp.getSalary();
				
			}
		}
		System.out.println("Maximum salary is : " + maxSalary);
	}

	private static void findLowestSalary(Employee[] employees) {
		double minSalary = employees[0].getSalary();
		for(Employee emp : employees) {
			if(minSalary >= emp.getSalary()) {
				minSalary = emp.getSalary();
				
			}
		}
		System.out.println("Minimum salary is : " + minSalary);
	}

	private static void findTotalSalaryByDept(Employee[] employees) {
		double tSalary = 0.0;
		for(Employee emp : employees) {
			if("Admin".equals(emp.getDepartment())) {
				tSalary = tSalary + emp.getSalary();
			}
		}
		System.out.println("Total Salary of admin Department : " + tSalary);
	}

	private static void countEmpsByCity(Employee[] employees) {
		int count2 = 0;
		for(Employee emp : employees) {
			if("Ghorahi".equals(emp.getCity())) {
				count2++;
			}
		}
		System.out.println("Ghorahi city's counting is : " + count2);
	}

	private static void countEmpsByDepartment(Employee[] employees) {
		int count1 = 0;
		for(Employee emp : employees) {
			if("Admin".equals(emp.getDepartment())) {
				count1++;
			}
			
		}
		System.out.println(count1);
	}

	private static void printEmployeesByDepartment(Employee[] employees) {
		for(Employee emp : employees) {
			if("IT".equals(emp.getDepartment())){
				System.out.println(emp.toString());
			}
		}
	}

	//A
	private static void calculateTotalSalary(Employee[] employees) {
		
		double totalSalary = 0.0;
		for(Employee emp : employees) {
			totalSalary = totalSalary + emp.getSalary();
			 
		}
		System.out.println(totalSalary);
	}

}
