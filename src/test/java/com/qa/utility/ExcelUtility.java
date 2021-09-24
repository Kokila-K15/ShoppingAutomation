package com.qa.utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	static FileInputStream fileLoc;
	static XSSFWorkbook workBook;
	static XSSFSheet  wSheet;
	
	public static Object[][] getCheckOutData(String Filename, String sheetName) throws IOException {
		
	    fileLoc=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook=new XSSFWorkbook(fileLoc);
		wSheet=workBook.getSheet(sheetName);
		int lastRowNum=wSheet.getLastRowNum();
		int lastCellNum=wSheet.getRow(0).getLastCellNum();
		
		Object[][] data=new Object[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++) {
		    DataFormatter formatter = new DataFormatter();
		    data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
		   }
		}
		return data;
	}

	public static Object[][] getWishListData(String Filename, String sheetName) throws IOException {
		
		fileLoc=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook=new XSSFWorkbook(fileLoc);
		wSheet=workBook.getSheet(sheetName);
		int lastRowNum=wSheet.getLastRowNum();
		int lastCellNum=wSheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[lastRowNum][lastCellNum];
		for(int i=1;i<=lastRowNum;i++)
		{
			for(int j=0;j<lastCellNum;j++) {
		    DataFormatter formatter = new DataFormatter();
		    data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
		   }
		}
		return data;
	}
	
	public static Object[][] getSearchData(String Filename, String sheetName) throws IOException {
		fileLoc=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(sheetName);
		 int Totalrow = wSheet.getLastRowNum();
		int Totalcolumn = wSheet.getRow(0).getLastCellNum();
		Object[][] value = new Object[Totalrow][Totalcolumn];
		for(int l=1;l<=Totalrow;l++)
		{
			XSSFRow row = wSheet.getRow(l);
			for(int m=0;m<Totalcolumn;m++)
			{
			  String item = row.getCell(m).toString();
		
			  value[l-1][m] =item;
			}
		}
		
		return value;
	}

	public static Object[][] getOrderHistoryData(String Filename, String sheetName) throws IOException {
		
		fileLoc=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(sheetName);
		 int Totalrow = wSheet.getLastRowNum();
		int Totalcolumn = wSheet.getRow(0).getLastCellNum();
		Object[][] value = new Object[Totalrow][Totalcolumn];
		for(int i=1;i<=Totalrow;i++) {
			for(int j=0;j<Totalcolumn;j++)
			{
				DataFormatter formatter = new DataFormatter();
				value[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		
		return value;
	}
	
	public static Object[][] getPersonInfoData(String Filename, String sheetname) throws IOException {
		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
	    wSheet = workBook.getSheet(sheetname);
		int lastrow = wSheet.getLastRowNum();
		int lastcol = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastrow][lastcol];
		for(int i=1;i<=lastrow;i++) {
			for(int j=0;j<lastcol;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}

	public static Object[][] getRegisterData(String Filename, String Sheet) throws IOException {
		
		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(Sheet);
		int RowCount = wSheet.getLastRowNum();
		int ColumnCount = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<ColumnCount;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}

	public static Object[][] getQuickViewData(String Filename, String Sheet) throws IOException {
		
		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(Sheet);
		int RowCount = wSheet.getLastRowNum();
		int ColumnCount = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<ColumnCount;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}

	public static Object[][] getUpdateAddressData(String Filename, String Sheet) throws IOException {

		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(Sheet);
		int RowCount = wSheet.getLastRowNum();
		int ColumnCount = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<ColumnCount;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}

	public static Object[][] getAddAddressData(String Filename, String Sheet) throws IOException {

		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(Sheet);
		int RowCount = wSheet.getLastRowNum();
		int ColumnCount = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<ColumnCount;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}

	public static Object[][] getSummaryData(String Filename, String Sheet) throws IOException {

		fileLoc= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\qa\\testdata\\"+Filename+".xlsx");
		workBook = new XSSFWorkbook(fileLoc);
		wSheet = workBook.getSheet(Sheet);
		int RowCount = wSheet.getLastRowNum();
		int ColumnCount = wSheet.getRow(0).getLastCellNum();
		Object[][] data = new Object[RowCount][ColumnCount];
		for(int i=1;i<=RowCount;i++)
		{
			for(int j=0;j<ColumnCount;j++)
			{
				DataFormatter formatter = new DataFormatter();
				data[i-1][j] = formatter.formatCellValue(wSheet.getRow(i).getCell(j));
			}
		}
		return data;
	}
	
}
