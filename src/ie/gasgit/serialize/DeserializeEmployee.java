package ie.gasgit.serialize;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeEmployee {


	public static void main(String[] args) {
		
		// create new obj
		Employee deserializedEmployee = null;
		
		try {
			// read file as bytes
			FileInputStream fileIn = new FileInputStream("employee.ser");
			// deSerialize file 
			ObjectInputStream ois = new ObjectInputStream(fileIn);
			// read  to new obj
			deserializedEmployee = (Employee) ois.readObject();
			ois.close();
			fileIn.close();
			
			
		} catch (Exception e) {
		
			System.out.println(e.toString());
		}
		
		System.out.println("First Name: " + deserializedEmployee.getFirstName());
		System.out.println("Last Name: " + deserializedEmployee.getLastName());
		System.out.println("PPS NO: " + deserializedEmployee.getPps());
		System.out.println("Position: " + deserializedEmployee.getPosition());
		System.out.println("Salary: " + deserializedEmployee.getSalary());
		System.out.println("To String: " + deserializedEmployee.toString());

		

	}

}
