package assignment_2;

public class Employee {
	
	private Integer id;
	private String name;
	private String company;
	private Double salary;
	private String department;
	private String post;
	private String city;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	public String toString() {
		return "Id : " + id + "\tName : " + name + "\tCompany : " + company + "\tSalary : " + salary + 
				"\tDepartment : " + department + "\tPost : " + post + "\tCity : " + city;
	}

}
