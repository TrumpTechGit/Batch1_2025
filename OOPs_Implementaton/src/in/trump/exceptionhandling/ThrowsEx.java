package in.trump.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsEx {
	
	static void readFile(String filename) throws IOException,FileNotFoundException,Exception {
		BufferedReader reader = new BufferedReader(new FileReader(filename));
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println("Read line :"+line);
		}
		reader.close();  
	}

	public static void main(String[] args) {
		//file path
		String filepath = "C:/Users/Ramsamsani/OneDrive/Desktop/example123.txt";
		try {
		    readFile(filepath);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
