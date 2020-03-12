package com.hust.soict.de.client_serve;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Client {
	static Socket  socket;
	public static void main(String[] args) throws IOException  {
		try {
			 socket = new Socket("127.0.0.1",9898);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
			PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
			System.out.println("nhập dãy số :");
			String message;
			Scanner scanner =new Scanner(System.in);
		while(true) {
			message = scanner.nextLine();
            out.println(message);
         System.out.println("warting for server!");
         Thread.sleep(1000);
         System.out.println("Sap xep:");
         String value = in.readLine();
         System.out.println(value);
        //         scanner.close();
		   
		}
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			socket.close();
			
			
			
			
		}
		
	}
}
