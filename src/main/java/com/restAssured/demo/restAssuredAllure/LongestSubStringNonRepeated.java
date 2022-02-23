package com.restAssured.demo.restAssuredAllure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class LongestSubStringNonRepeated {
	public static int longestUniqueSubsttr(String str)
    {
	String test = "";
	 
     // Result
     int maxLength = -1;

     // Return zero if string is empty
     if (str.isEmpty()) {
         return 0;
     }
     // Return one if string length is one
     else if (str.length() == 1) {
         return 1;
     }
     for (char c : str.toCharArray()) {
         String current = String.valueOf(c);

         // If string already contains the character
         // Then substring after repeating character
         if (test.contains(current)) {
             test = test.substring(test.indexOf(current)
                                   + 1);
         }
         test = test + String.valueOf(c);
         maxLength = Math.max(test.length(), maxLength);
     }

     return maxLength;
    }
	public static void main(String[] args) {
		Long start = System.currentTimeMillis();
		/*
		 * String s = "GEEKSFORGEEKS"; // Create list of substrings from S List<String>
		 * l1 = new ArrayList<String>(); for (int i = 0; i < s.length(); i++) for (int j
		 * = i + 1; j <= s.length(); j++) l1.add(s.substring(i, j));
		 * System.out.println("list of substrings = " + l1);
		 * 
		 * // Instantiate Set and Hashmap
		 * 
		 * HashMap<String, Integer> combo = new HashMap<String, Integer>(); // For each
		 * substring from list create a set and check for the length of string // and
		 * set for (String str : l1) { Set<String> setDist = new HashSet<String>();
		 * 
		 * for (String aa : str.split("")) { setDist.add(aa); }
		 * System.out.println("FOR STRING : " + str + " | set created is : " + setDist);
		 * 
		 * // If length of string is equal to size of set then add that combo to the //
		 * hashmap if (str.length() == setDist.size()) { combo.put(str, setDist.size());
		 * } } List<String> Listofkeys =
		 * combo.keySet().stream().collect(Collectors.toList()); List<Integer>
		 * Listofvalues = combo.values().stream().collect(Collectors.toList());
		 * Collections.sort(Listofvalues); int longestSubStringLength =
		 * Listofvalues.get(Listofvalues.size() - 1); List<String> result =
		 * Listofkeys.stream().filter(word -> word.length() == longestSubStringLength)
		 * .collect(Collectors.toList()); System.out.println("Map of combos is : " +
		 * combo); System.out.println("Longest Substrings from String : " + s +
		 * " are : " + result); System.out.println("Longest Substring length : " +
		 * longestSubStringLength);
		 */
		 String str = "abac";
	        System.out.println("The input string is " + str);
	 
	        int len = longestUniqueSubsttr(str);
	        System.out.println("The length of the longest "
	                           + "non-repeating character "
	                           + "substring is " + len);

	}
}
