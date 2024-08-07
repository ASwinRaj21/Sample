package writeexcelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutputInput {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\aswin\\eclipse-workspace\\Sample\\target\\Sample.xlsx");
		
//		boolean mkdir = f.mkdir();
//		System.out.print(mkdir);
		
		FileOutputStream f1 = new FileOutputStream(f);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");
		XSSFRow row = sheet.createRow(0);
		XSSFCell col = row.createCell(0);
		col.setCellValue("Aswin");
		
		List<String> names = new ArrayList<String>();
		names.add("princy");
		names.add("Yamuna");
		names.add("Sukanya");
		
		for(int i=0;i<names.size();i++) {
			XSSFRow row1 = sheet.createRow(i+1);
			XSSFCell col1 = row1.createCell(i+1);
			col1.setCellValue(names.get(i));
		}
		
		book.write(f1);
		
		FileInputStream f2 = new FileInputStream(f);
		XSSFWorkbook b = new XSSFWorkbook(f2);
		XSSFSheet s = b.getSheet("Sheet1");
		XSSFRow r = s.getRow(0);
		XSSFCell c = r.getCell(0);
		
		String cellvalue = c.getStringCellValue();
		System.out.println(cellvalue);
	}

}
