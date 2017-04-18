package ie.gasgit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ParseCSV {

	
	public static void main(String[] args) {
		// create array list to store data
		ArrayList<String> list = new ArrayList<>();
		// read file with scanner
		try (Scanner csvFile = new Scanner(new File("Galway_City_Beaches.csv"))) {
			// iterate file and add to list
			while (csvFile.hasNext()) {
				list.add(csvFile.nextLine());
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// create temp array to store converted list
		String[] tempArray = list.toArray(new String[1]);
		String[][] csvArray = new String[tempArray.length][];
		// 
		for (int i = 0; i < csvArray.length; i++) {
			csvArray[i] = tempArray[i].split(",");

		}
		// regular for  unpack on i
		for (int i = 0; i < csvArray.length; i++) {
			System.out.println(Arrays.toString(csvArray[i]));
						
		}
		// foreach element in csvArray...
		for(String[] s : csvArray){
			System.out.println(Arrays.toString(s));
			
		}
		

	}
}
