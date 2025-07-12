package in.trump.utilpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("C://Users//Ramsamsani//OneDrive//Desktop//java file - trump/db.properties");
        p.load(fis);
        System.out.println(p);
	}

}
