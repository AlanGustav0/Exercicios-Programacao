package enitites;

public class Employee {
	
	private String name;
	private String email;
	private Double salary;
	
	public Employee(String name,String email,Double salary) {
		this.name = name;
		this.email = email;
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail() {
		this.email = email;
	}
	
	public Double getSalary(){
		return this.salary;
	}
	

}
