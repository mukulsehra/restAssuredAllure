package com.restAssured.demo.restAssuredAllure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

public class FileOperations {
	
	public void writeDataToCsvFile(File fileObj) {
		try {
		FileWriter fis = new FileWriter(fileObj, true);
		BufferedWriter br = new BufferedWriter(fis);
		br.append("Name,Designation,Org");
		br.newLine();
		br.append("MS,Consultant,A1");
		br.newLine();
		br.append("Mukul,Consultant,A2");
		br.newLine();
		br.append("test1,Consultant,A3");
		br.newLine();
		br.append("test2,Consultant,A4");
		br.newLine();
		br.append("test3,Consultant,A5");
		br.newLine();
		br.append("test4,Consultant,A6");
		br.newLine();
		br.close();
		}
		
		catch(IOException ioe) {
		
	   }
	}

	public void readFileAndStoreInListOfMaps(File fileObj) {
		try {
	FileReader fis = new FileReader(fileObj);
	BufferedReader br = new BufferedReader(fis);
	String line;
	List<String> keys = new ArrayList<String>();
	int lineCount = 0;
	List<LinkedHashMap<String, String>> finalList = new ArrayList<LinkedHashMap<String,String>>();
	while((line = br.readLine()) != null) {
		lineCount ++;
		if(lineCount == 1) {
			keys = Arrays.asList(line.split(","));
			continue;
		}
		else {
			String[] values = line.split(",");
		    LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
	       for(int i = 0; i< values.length; i++)
	    	   map.put(keys.get(i), values[i]);
	     finalList.add(map);  
	    	   
		}
	}
	br.close();
	System.out.println(finalList + "\n");
	
	for(LinkedHashMap<String, String> m : finalList)
		System.out.println(m);	
	}
	catch(IOException ioe) {
		ioe.printStackTrace();
	}
	}
	
	public static void main(String[] args) {
		FileOperations fo = new FileOperations();
		File fileObj = new File("D:\\Learning\\mukul.csv");
		fo.writeDataToCsvFile(fileObj);
		fo.readFileAndStoreInListOfMaps(fileObj);
		
	}
	
}
