package com.restAssured.demo.restAssuredAllure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {
	   @SuppressWarnings("unchecked")
	public static void main(String[] args) {
	      List<Student> list = new ArrayList<Student>();
	      list.add(new Student("Ramesh", 30, 20));
	      list.add(new Student("Adithya", 7, 10));
	      list.add(new Student("Krishna", 25, 5));
	      list.add(new Student("Vineet", 24, 15));
	      System.out.println("BEFORE SORTING");
	      for (Student e : list) {
	         System.out.println("[ STU : name = " + e.name + " age = " + e.age + " roll = " + e.roll + "]");
	      }
	      Collections.sort(list,new AgeComparator());
	      System.out.println("AFTER SORTING WITH AGE");
	      for (Student e : list) {
	         System.out.println("[ STU : name = " + e.name + " age = " + e.age + " ]");
	      }
	      Collections.sort(list,new RollComparator());
	      System.out.println("AFTER SORTING WITH ROLL");
	      for (Student e : list) {
	         System.out.println("[ STU : name = " + e.name + " roll = " + e.roll + " ]");
	      }
	      
	      Collections.sort(list,new NameComparator());
	      System.out.println("AFTER SORTING WITH Name");
	      for (Student e : list) {
	         System.out.println("[ STU : name = " + e.name + " roll = " + e.roll + " ]");
	      }
	   }
	}