package wrapper;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public  String[][] readExcel(String fileName) throws IOException {
		// TODO Auto-generated method stub
		
		//File Path
		XSSFWorkbook wb= new XSSFWorkbook("./data/"+fileName+".xlsx");
		
		//get sheet
		XSSFSheet sh= wb.getSheetAt(0);
		
		//get row count
		
		int rowCount= sh.getLastRowNum();
		// Column count
		int colCount =sh.getRow(0).getLastCellNum();
		
		String [][] data=new String[rowCount][colCount];
	//for Row
		for (int i = 1; i <= rowCount; i++) {
			XSSFRow	row = sh.getRow(i);
		
		//for column
		for (int j = 0; j< colCount; j++) {
			XSSFCell	cell = row.getCell(j);
		
		String value=cell.getStringCellValue();
		data [i-1][j]=value;
			}
 }
		return data;	
		}
	}
