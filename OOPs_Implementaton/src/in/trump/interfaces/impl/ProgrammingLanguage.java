package in.trump.interfaces.impl;

import in.trump.interfaces.Language;
import in.trump.interfaces.Owner;

public class ProgrammingLanguage implements Language, Owner {

	@Override
	public void getName(String name) {
		System.out.println("Programming language : "+name);
	}
	
	@Override
	public void ownerName(String name) {
	  System.out.println("Own by "+name);	
	}
	//Object A=new programming languages ()
	public static void main(String[] args) {
		//Language i = new Language();
		//Cannot instantiate the type Language
	
		//Language i = new ProgrammingLanguage();
		
		ProgrammingLanguage pl = new ProgrammingLanguage();
		pl.getName("Java !!");
		
		Owner pl2 = new ProgrammingLanguage();
		pl2.ownerName("oracle");
	}

}
