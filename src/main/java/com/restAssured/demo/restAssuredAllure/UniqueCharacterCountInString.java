package com.restAssured.demo.restAssuredAllure;

import java.util.LinkedHashMap;

public class UniqueCharacterCountInString {
	
	public void countUniqueChar(String s) {
		LinkedHashMap<String, Integer> charRecords = new LinkedHashMap<String, Integer>();
		
		if(s.length() == 0) {System.out.println("String is Empty");}
		else {
		
		for(char c : s.toCharArray()) {
			String sChar = String.valueOf(c).toUpperCase();
			if(charRecords.containsKey(sChar)) {
				charRecords.put(sChar, charRecords.get(sChar) + 1);
				
			}
			else
			charRecords.put(sChar, 1);
		}
		System.out.println(charRecords);
		
		}
	}

	
	public static void main(String str[]) {
		UniqueCharacterCountInString u = new UniqueCharacterCountInString();
		u.countUniqueChar("AryanDhawan");
	}
}
