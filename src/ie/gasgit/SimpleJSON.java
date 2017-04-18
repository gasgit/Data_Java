package ie.gasgit;

import java.io.FileReader;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class SimpleJSON {

	public static void main(String[] args) {
		// create new JSONParser
		JSONParser myParser = new JSONParser();
		try {
			// read file with parser
			Object obj = myParser.parse(new FileReader("customer.json"));
			// convert object to JSONObject
			JSONObject jobj_outer = (JSONObject) obj;
			// print jobj_outer 
			System.out.println(jobj_outer.toString());
			// extract values for key
			String firstName = (String) jobj_outer.get("firstName");
			String lastName = (String) jobj_outer.get("lastName");
			long age = (long) jobj_outer.get("age");
			
			// print values
			System.out.println("First: " + firstName);
			System.out.println("Last: " + lastName);
			System.out.println("Age: " + age);

			// boolean check if key exists
			//System.out.println(jobj_outer.containsKey("address"));
			
			if(jobj_outer.containsKey("address")){
				// create new JSONObject for address
				JSONObject jobj_address = (JSONObject) jobj_outer.get("address");
				// print values from key
				System.out.println("Street: " + jobj_address.get("streetAddress"));	
				System.out.println("City: " + jobj_address.get("city"));
				System.out.println("County: " + jobj_address.get("county"));
				System.out.println("Eircode: " + jobj_address.get("EirCode"));

			}
			
			// create JSONArray to store inner array phoneNumbers
			JSONArray jarray = (JSONArray)jobj_outer.get("phoneNumber");
			
			
			//iterate array to extract each object
			for(Object o : jarray){
				// print object
				System.out.println(o.toString());
				
				
				
			}
				

		} catch (Exception e) 
		{
			System.out.println(e.toString());
		}

	}

}
