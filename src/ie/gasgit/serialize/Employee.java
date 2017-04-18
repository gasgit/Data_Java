package ie.gasgit.serialize;

import java.io.Serializable;

public class Employee implements Serializable {
	
	public String firstName;
	public String lastName;
	public String pps;
	public String position;
	public int salary;
	
	
	public Employee(String firstName, String lastName, String pps,
			String position, int salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.pps = pps;
		this.position = position;
		this.salary = salary;
	}


	public Employee() {
		super();
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPps() {
		return pps;
	}


	public void setPps(String pps) {
		this.pps = pps;
	}


	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName
				+ ", pps=" + pps + ", position=" + position + ", salary="
				+ salary + "]";
	}
	
	
	
	
	
	
	
	
	

}
