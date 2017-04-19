package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileIO_File2File {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*=============================================================================
		 * A file is in a directory, read it through this program
		 * and write the the contents of this file into a new file.
		 * file.txt --> read in a buffer ---> write this buffer --> file2
		 * before writing on file2, create output stream on file2.
		 */
		
		String file = "file.txt";
		//File file2 = new File("file2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		// upto this point the contents of the file in bufferedReader 
		// now we have to write the contents in a new file
		
		File path = new File("file2.txt");
		FileOutputStream fos = new FileOutputStream(path);
		
		String line2;
		while((line2 = br.readLine()) != null){
			byte[] contents = line2.getBytes();
			fos.write(contents);
			}
		fos.close();

	}

}
