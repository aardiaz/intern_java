package encapsulation;

public class Test {
	
	public static void main(String[] args) {
		
		Product  p = new Product();
		
		p.setId(454);
		p.setName("TV");
		p.setPrice(80000);
		p.setCompany("CG");
	
		System.out.println(p);
		
//		System.out.println("Id = "+p.getId());
//		System.out.println("Name  = "+p.getName());
//		System.out.println("Price = "+p.getPrice());
//		System.out.println("Company = "+p.getCompany());
		
	}

}
