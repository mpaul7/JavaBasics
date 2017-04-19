package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FIleIO_File2Console {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*============================================================================
		 * A file is in a directory, and read it in this program
		 * Output the contents on the console. 
		 */
		String file1 = "file.txt";
		// Read this file
		FileReader fr = new FileReader(file1);
		// Buffer this file 
		BufferedReader br = new BufferedReader(fr);
		// to show the contents of the file on the console
		String line;
		while((line = br.readLine()) != null){
			System.out.println(line);
			}
		// close the BufferedReader
		br.close();
	}
}
