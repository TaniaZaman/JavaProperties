/*package javaStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WrittingExcel {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("first sheet");
		
		Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		cellA.setCellValue("first col");
		cellB.setCellValue("second col");
		for( int rows=0; rows<10; rows++) {
			Row row0 = sheet0.createRow(rows);
			for( int cells=0; cells<10; cells++) {
				Cell cellB = row0.createCell(cells);
				cellB.setCellValue((int)(Math.random()*100));
				
			}
			
			
		}
		
		//connecting stream
		
		File f = new File("C:\\filewritting\\myWrittingFile.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		
		workbook.write(fo);
		//closing stream
		fo.close();
		System.out.println("File Created");
		
		


	}

}
*/