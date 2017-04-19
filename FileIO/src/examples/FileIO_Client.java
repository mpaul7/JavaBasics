package examples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class FileIO_Client {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket client = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		PrintStream pr = null;
		//PrintWriter pw = null;
		try{
		client = new Socket("localhost", 4422);
		
		isr = new InputStreamReader(client.getInputStream());
		br = new BufferedReader(isr);
		pr = new PrintStream(client.getOutputStream());
		pr.println("Hello from Client!");
		
		
		
		String msg = br.readLine();
		System.out.println(msg);
		
		File file = new File("b.txt");
		fos = new FileOutputStream(file);
		String line;
		while((line = br.readLine()) != null){
			byte[] contentsOfFile2 = line.getBytes();
			fos.write(contentsOfFile2);
			}
		}catch (IOException e) {	
			System.out.println("IOException" + e);
		}catch(Exception e){
			System.out.println("Exception occured");
			}
		}
	}

