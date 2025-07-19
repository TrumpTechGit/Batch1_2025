package in.trump.iofilehandling;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		try {
		    //create resourses
			FileInputStream fis = new FileInputStream("demofile.txt");
			ObjectInputStream oos = new ObjectInputStream(fis);
			
			Employee e = (Employee)oos.readObject();
			System.out.println("Deserialization successfull !");
			System.out.println("emp name : "+e.name+"  & emp id : "+e.id);
			//close resources
			oos.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
