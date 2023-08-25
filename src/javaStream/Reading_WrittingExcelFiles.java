package javaStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reading_WrittingExcelFiles {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\filewritting\\MyReadingWrittingFiles.txt");
		f.createNewFile();
		String i = "";
		
		//writting inside the Stream
		
		/*FileWriter fw = new FileWriter("C:\\filewritting\\MyReadingWrittingFiles.txt");
		BufferedWriter filewriter = new BufferedWriter(fw);
		
		filewriter.write("This is my first Line");
		filewriter.newLine();
		filewriter.write("This is my second Line");
		filewriter.newLine();
		filewriter.write("This is my third Line");
		filewriter.newLine();
		*/
		
		//filewriter.flush();
		
		//System.out.println("File Created");
		
		
		//Reading inside the file
		
		FileReader fr = new FileReader("C:\\filewritting\\MyReadingWrittingFiles.txt");
		BufferedReader filereader = new BufferedReader(fr);
		while((i=filereader.readLine())!=null) {
		System.out.println(i);
		}


	}

}
