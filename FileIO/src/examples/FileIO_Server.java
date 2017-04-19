package examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileIO_Server {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		Socket client = null;
		InputStreamReader isr = null;
		BufferedReader brSocket = null;
		BufferedReader brFile = null;
		PrintStream pr = null;
		try{
			server = new ServerSocket(4422);
			while(true){
				System.out.println("Waiting...");
				try{
					client = server.accept();
					System.out.println("Connected to  : " + client.getRemoteSocketAddress());
					isr = new InputStreamReader(client.getInputStream());
					brSocket = new BufferedReader(isr);
					pr = new PrintStream(client.getOutputStream());
					String msg = brSocket.readLine();
					System.out.println(msg);
					
					if (msg != null){
						pr.println("Message received!");
						
					    brFile = new BufferedReader(
								     new FileReader("file.txt"));
						String line;
						while((line = brFile.readLine()) != null){
							byte[] contentsOfFile = line.getBytes();
							pr.write(contentsOfFile);
							}
						}
					}finally {
						System.out.println("From finally block1!");
						if (isr != null) isr.close();
						if (brSocket != null) brSocket.close();
						if (brFile != null) brFile.close();
						if (client != null) client.close();
						}
				} // end of while, while loop keeps the server running
			}catch (IOException e) {
				System.out.println("IOException" + e);
				}catch(Exception e){
					System.out.println("Exception occured" + e);
					}finally {
						System.out.println("From finally block2!");
						if(server != null) server.close();
						}
		}
	}
