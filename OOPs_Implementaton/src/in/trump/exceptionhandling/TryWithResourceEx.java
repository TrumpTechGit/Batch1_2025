package in.trump.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceEx {

	public static void main(String[] args)  {
		//file path
		String filepath = "C:/Users/Ramsamsani/OneDrive/Desktop/example.txt";
		try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
			//read lines from file
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println("Read line :"+line);
			}
			//closing the resource is optional
			reader.close();  
		} 	
		catch (IOException ioe) {
			System.out.println(ioe);
		}

	}

}
