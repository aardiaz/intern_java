package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();
		
		p.id = 3434;
		p.name = "Kamal Giri";
		p.company= "Google";
		p.progLang = "Java";
		p.project = "G-Earth";
		p.salary = 9000000;
		p.bonus = 140000;
		
		p.print();
	}

}
