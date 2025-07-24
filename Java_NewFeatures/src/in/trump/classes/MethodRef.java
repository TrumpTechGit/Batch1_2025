package in.trump.classes;

import in.trump.interfaces.MyInterface;

public class MethodRef {
  static void m2() {
	  System.out.println("m2 method");
  }
	public static void main(String[] args) {
		MyInterface i = MethodRef::m2;
		i.m1();
		//MethodRef mr = MethodRef::m2;

	}
}
