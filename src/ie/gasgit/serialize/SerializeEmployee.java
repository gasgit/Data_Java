package ie.gasgit.serialize;

import java.io.*;

public class SerializeEmployee {

	
	public static void main(String[] args) {
		
		
		// new instance obj 
		Employee employee = new Employee();
		employee.setFirstName("john");
		employee.setLastName("Doe");
		employee.setPps("12345g");
		employee.setPosition("Manager");
		employee.setSalary(100000);
		
		try {
			// serialize new instance to file
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream outStream = new ObjectOutputStream(fileOut);
			outStream.writeObject(employee);
			outStream.close();
			fileOut.close();
			System.out.println("Employee serialized !!");
					
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
