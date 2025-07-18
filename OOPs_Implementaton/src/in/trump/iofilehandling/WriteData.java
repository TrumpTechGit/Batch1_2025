package in.trump.iofilehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteData {

	public static void main(String[] args) {
		File file = new File("E://demofile.txt");
		if(file.exists()) {
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.getAbsolutePath());
		}
		try {
			FileWriter writer = new FileWriter(file);
			writer.write("Hello Trump Technologies hyd !");
			writer.write("Welcome to java world !");
			writer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		//System.out.println("Done ...");
		
		if(file.exists()) {
			//System.out.println("Is file deleted :"+file.delete()); 
		}

	}

}
