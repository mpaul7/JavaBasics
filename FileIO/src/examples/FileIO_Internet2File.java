package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class FileIO_Internet2File {
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// reading a file from internet
		URL url = new URL("http://mirrors.xmission.com/gutenberg/etext98/2ws2610.txt");
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(
				                     new InputStreamReader(is));
		
		File path = new File("fileInternet.txt");
		FileOutputStream fos = new FileOutputStream(path);
		
		String line;
		while((line = br.readLine()) != null){
			byte[] contents = line.getBytes();
			fos.write(contents);
			}
		System.out.println("Done reading!");
		}
	}

