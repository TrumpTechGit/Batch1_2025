package in.trump.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithFinallyEx {

	public static void main(String[] args) {
		// file path
		 String filepath = "C:/Users/Ramsamsani/OneDrive/Desktop/example.txt";
		//String filepath = "randomfile.txt";
		BufferedReader reader = null;
		//DBConnection con = null;
		try {
			//con = getConnection();
			reader = new BufferedReader(new FileReader(filepath));
			// read lines from file
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println("Read line :" + line);
			}

		} catch (IOException ioe) {
			System.out.println(ioe);
		} finally {
			System.out.println("TryWithFinallyEx.finally");
			// to perform clean up code activities
			try {
				if (reader != null) {
					reader.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
