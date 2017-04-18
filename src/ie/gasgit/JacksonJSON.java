package ie.gasgit;

import java.io.File;
import java.util.Arrays;

import org.codehaus.jackson.JsonFactory;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.SerializableString;


public class JacksonJSON {

	
	public static void main(String[] args) {
		
		
		try {
			
			JsonFactory factory = new JsonFactory();
			// read file with json parser
			JsonParser parser = factory.createJsonParser(new File("customer.json"));
			// move to next token 
			parser.nextToken();

			// loop while token is not end object or end of an array
			while(parser.nextToken() != JsonToken.END_OBJECT || parser.nextToken() != JsonToken.END_ARRAY){
				
				// create key from current token
				String key = parser.getCurrentName();
				// check field name is equal to key
				if(key.equals("firstName")){
					// move to next token and print as value
					parser.nextToken();
					System.out.println(key + " : " + parser.getText());
				}
				if(key.equals("lastName")){
					parser.nextToken();
					System.out.println(key + " : " + parser.getText());	
				}
				if(key.equals("streetAddress")){
					parser.nextToken();
					System.out.println(key + " : " + parser.getText());	
				}
				if(key.equals("city")){
					parser.nextToken();
					System.out.println(key + " : " + parser.getText());
				}
				if(key.equals("county")){
					parser.nextToken();
					System.out.println(key + " : " + parser.getText());
				}
				// 
				while("phoneNumber".equals(key)){
					
					
					while(parser.nextToken() != JsonToken.FIELD_NAME){
						parser.nextToken();
						
						
					}
					System.out.println(parser.getCurrentName()  + " : " + parser.nextTextValue());
									 			
				}
								
			}
			parser.close();
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		System.exit(0);
		

	}

}
