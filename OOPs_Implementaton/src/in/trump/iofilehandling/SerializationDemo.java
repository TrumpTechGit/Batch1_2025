package in.trump.iofilehandling;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		try {
		    Employee e = new Employee("Teja", 201);
			
			FileOutputStream fout = new FileOutputStream("demofile.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(e);
			System.out.println("....");
			out.flush();  //flush() forces all that buffered data to be written to demofile.txt immediately.
			
			//close all streams
			out.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
