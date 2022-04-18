package com.restAssured.demo.restAssuredAllure;

import java.util.*;
class Student {
   String name;
   int age, roll;
   Student(String name, int age, int roll) {
      this.name = name;
      this.age = age;
      this.roll = roll;
   }
}
class AgeComparator implements Comparator {
   @Override
   public int compare(Object o1, Object o2) {
      return ((Student) o1).age - ((Student) o2).age;
   }
}
class RollComparator implements Comparator {
   @Override
   public int compare(Object o1, Object o2) {
      return ((Student) o1).roll - ((Student) o2).roll;
   }
}

class NameComparator implements Comparator {
	   @Override
	   public int compare(Object o1, Object o2) {
	      return ((Student)o1).name.compareTo(((Student)o2).name);
	   }
	}