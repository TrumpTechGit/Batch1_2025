package in.trump.ObjectClassMethods;

public class ToStringDemo {

	public static void main(String[] args) {
		Student s = new Student(101, "Teja");
		
		//without toString() in Student class
		//System.out.println(s); //in.trump.ObjectClassMethods.Student@e580929
		//System.out.println(s.toString());//in.trump.ObjectClassMethods.Student@e580929
		
		//with toString()
		System.out.println(s);
		
		Student s1 = new Student(102, "Sai");
		System.out.println(s1); //102 sai
	}

}
