package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Write {

	public static void write_Data() throws Throwable {

		File f = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\Book1.xltx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet createSheet = w.createSheet("class data");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("name");
		w.getSheet("class data").getRow(0).createCell(1).setCellValue("marks");
		w.getSheet("class data").getRow(0).createCell(2).setCellValue("pass/fail");
		w.getSheet("class data").createRow(1).createCell(0).setCellValue("Snega");
		w.getSheet("class data").getRow(1).createCell(1).setCellValue("120");
		w.getSheet("class data").getRow(1).createCell(2).setCellValue("pass");	
		w.getSheet("class data").createRow(2).createCell(0).setCellValue("lokesh");
		w.getSheet("class data").getRow(2).createCell(1).setCellValue("154");
		w.getSheet("class data").getRow(2).createCell(2).setCellValue("pass");
		w.getSheet("class data").createRow(3).createCell(0).setCellValue("rajkumar");
		w.getSheet("class data").getRow(3).createCell(1).setCellValue("175");
		w.getSheet("class data").getRow(3).createCell(2).setCellValue("pass");
		w.getSheet("class data").createRow(4).createCell(0).setCellValue("nelson");
		w.getSheet("class data").getRow(4).createCell(1).setCellValue("60");
		w.getSheet("class data").getRow(4).createCell(2).setCellValue("fail");
		w.getSheet("class data").createRow(5).createCell(0).setCellValue("atlee");
		w.getSheet("class data").getRow(5).createCell(1).setCellValue("180");
		w.getSheet("class data").getRow(5).createCell(2).setCellValue("pass");
		
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		w.close();
	}
	
	public static void main(String[] args) throws Throwable {
		
		write_Data();
	}
	
	
}
