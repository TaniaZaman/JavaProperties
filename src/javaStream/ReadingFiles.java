package javaStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) throws IOException {
		//stream connecting 
		File f = new File("C:\\\\filewritting\\\\mytextFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader reader = new BufferedReader(fr);
		
		//Read Inside the file
		String line = null;
		while((line = reader.readLine())!=null) {
			
			
			
			System.out.println(line);
		}
		//close the stream
		reader.close();
		
		

		


	}

}
