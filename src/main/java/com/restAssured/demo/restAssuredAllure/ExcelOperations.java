package com.restAssured.demo.restAssuredAllure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {
	public static Object key, value;
	public void getkeyVal(Cell cell, String ss) {
		if(cell.getColumnIndex()==0) {
			key = cell.getStringCellValue();
		}
		else {
			if("STRING".equals(ss)) {
			    value = cell.getStringCellValue();
			}
			else if(("NUMERIC".equals(ss))){
				value = cell.getNumericCellValue();
	}
			
			}}
	public static void main(String[] args) throws IOException {
		ExcelOperations oo = new ExcelOperations();
		
		FileInputStream file = new FileInputStream(new File("D://poiDemo.xlsx"));
		Workbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = (XSSFSheet) workbook.getSheetAt(0);

		Map<Object, Object> data = new LinkedHashMap<>();
		
		for (Row row : sheet) {
		    for (Cell cell : row) {
		    	switch(cell.getCellType()) {
		    	case STRING: System.out.println(cell.getStringCellValue());
		    	             oo.getkeyVal(cell, "STRING");
		    	             break;
		    	case NUMERIC: System.out.println(cell.getNumericCellValue());
		    	              oo.getkeyVal(cell, "NUMERIC");  
		    	              break;
		    	default: System.out.println(cell.getRichStringCellValue());
		    	}
		    	
		    	
		    }
		    data.put(key, value);
		   
	}
	file.close();


	System.out.println(data);
	System.out.println(data.get("baseUri"));
	System.out.println(data.get("port").toString().replace(".0", ""));
	}
}


