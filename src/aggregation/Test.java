package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car  c = new Car();
		
		c.setColor("Blue");
		c.setPrice(9000000);
		c.setModel("Mu887");
		
		Employee  emp = new Employee();
		
		emp.setId(35343);
		emp.setName("Pawan Singh");
		emp.setSalary(450000);
		emp.setCompany("Meta");
		emp.setCar(c);
		
		System.out.println("Id = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("Salary = "+emp.getSalary());
		System.out.println("----------car infor -----------");
		System.out.println("Color = "+emp.getCar().getColor());
		System.out.println("Model = "+emp.getCar().getModel());
		System.out.println("Price = "+emp.getCar().getPrice());
		
	}

}
