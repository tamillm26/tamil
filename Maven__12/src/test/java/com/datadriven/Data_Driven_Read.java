package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven_Read {

	public static void read_Paericuler_Data() throws Throwable {

		File f = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\Book1.xltx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(4);
		Cell cell = row.getCell(2);
		CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
			String Value = cell.getStringCellValue();
			System.out.println(Value);
		}
		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int n = (int) value;
			System.out.println();
		}
	}
	
	public static void read_All_Data() throws Throwable {

		File f = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\Book1.xltx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
		for (int j = 0; j < numberOfCells; j++) {
			Cell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
		if (cellType.equals(cellType.STRING)) {
				String value = cell.getStringCellValue();
				System.out.print(value);
			}
		else if (cellType.equals(cellType.NUMERIC)) {
			double value = cell.getNumericCellValue();
			int n = (int)value;
			System.out.print(n);
		    }
		System.out.print("       ");
	     }		
		System.out.println();
	  }	
	}
	public static void read_Particuler_Row() throws Throwable {

		File f = new File("C:\\Users\\tamil\\eclipse-workspace\\Maven__12\\Book1.xltx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheetAt = w.getSheetAt(0);
		Row row = sheetAt.getRow(1);
		CellType cellType = ((Cell) row).getCellType();
		if (cellType.equals(CellType.STRING)) {
			String value = ((Cell) row).getStringCellValue();
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) throws Throwable {
		read_Paericuler_Data();
	    read_All_Data();
	    read_Particuler_Row();
	
	
	}	
}