package in.trump.iofilehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadData {

	public static void main(String[] args) {
		File file = new File("E://demofile.txt");
		try {
			FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(fr);
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
