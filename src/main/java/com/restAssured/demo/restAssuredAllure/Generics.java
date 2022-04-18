package com.restAssured.demo.restAssuredAllure;

public class Generics<T> {
	private T data;
	
	public void setData(T data)  {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

	
	
	public static void main(String[] args) {
		Generics<String> g = new Generics<>();
		g.setData("Mukul");
		System.out.println("Value of data is : " + g.getData());
		Generics<Integer> ig = new Generics<>();
		ig.setData(123);
		System.out.println("Value of data is : " + ig.getData());
	}
}
