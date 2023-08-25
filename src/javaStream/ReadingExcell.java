//package javaStream;

/*import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingExcell {

	public static void main(String[] args) throws InvalidFormatException, IOException  {
		
		File f = new File("C:\\filewritting\\myWrittingFile.xlsx");
		FileInputStream fi = new FileInputStream(f);
		
		Workbook workbook = WorkbookFactory.create(fi);
		Sheet sheet0 = workbook.getSheetAt(0);
		for(Row row: sheet0) {
			for(Cell cell : row) {
				switch(cell.getCellType()) {
				
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
					
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
				case Cell.CELL_TYPE_BLANK:
					System.out.print("Blank cell"+ "\t");
					break;
				}
				
			}System.out.println();
		}
		
		
		
		Row row0 = sheet0.getRow(0);
		Cell cell = row0.getCell(0);
		
		
		fi.close();
		//System.out.println(cell);

	}

}
*/