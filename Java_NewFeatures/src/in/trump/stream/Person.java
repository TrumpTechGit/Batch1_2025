package in.trump.stream;

public class Person {
	
	///private feilds
	private String name;
	private Integer age;
	private String addrs;
	
	//parameterized constructor
	public Person(String name, Integer age, String addrs) {
		this.name = name;
		this.age = age;
		this.addrs = addrs;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getAddrs() {
		return addrs;
	}

	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	
	//tostring
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", addrs=" + addrs + "]";
	}
	
}
