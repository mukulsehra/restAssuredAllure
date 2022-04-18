package com.restAssured.demo.restAssuredAllure;

public class SingletonPattern {
	private static SingletonPattern sp;

	private SingletonPattern() {

	}

	public static SingletonPattern getInstance() {
		if (sp == null)
			sp = new SingletonPattern();
		return sp;
	}

	public void display() {
		System.out.println("SingleTon object created");
	}

	public static void main(String[] args) { 
		SingletonPattern sp = new SingletonPattern();
	    SingletonPattern.getInstance(); 
		sp.display(); 
		Class cc = SingletonPattern.class;
	   	System.out.println(cc.getDeclaredConstructors()[0].getName());
	   	System.out.println(cc.getDeclaredConstructors()[0].getModifiers()
	   			);
		}
}
 
