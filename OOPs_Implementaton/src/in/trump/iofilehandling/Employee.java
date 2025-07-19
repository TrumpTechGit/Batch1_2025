package in.trump.iofilehandling;

import java.io.Serializable;

public class Employee  implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
}
