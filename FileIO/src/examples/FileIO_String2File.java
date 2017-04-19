package examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileIO_String2File {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*=============================================================================
		 * How to write contents on a file.txt
		 */
		String contentsToWrite = "Hello world!";
		File path = new File("file1.txt");
		FileOutputStream outStream = new FileOutputStream(path);
		outStream.write(contentsToWrite.getBytes());
		outStream.close();
	}

}
