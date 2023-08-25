package javaStream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingFiles {

	public static void main(String[] args) throws IOException {
		//Stream connectivity
		File f = new File("C:\\filewritting\\mytextFile.html");
		
		FileWriter fw = new FileWriter(f,false);
		BufferedWriter writer = new BufferedWriter(fw);
		
		
		//writting inside the File
		/*writer.newLine();
		writer.write("first line");
		writer.newLine();
		writer.write("Bangladesh");
		writer.newLine();
		writer.write("Software Test ");
		writer.newLine();
		writer.write("Tania");
		writer.newLine();*/
		
	/*	
		for(int i=0; i<4; i++) {
			for(int j=0; j<3; j++) {
				int num = (int) (Math.random()*100);
				writer.write(num + ",");
				
			}writer.newLine();
		}
*/		
		
		writer.write("<html><body><title>Software test</title><h1>learning java</h1></body></html>");
		
		//closing the stream
		
		writer.close();
		
		System.out.println("File Created");
		



	}

}
