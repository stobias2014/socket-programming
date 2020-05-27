package com.tobias.saul;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class GreetingServer extends Thread{
	
	private ServerSocket serverSocket;
	
	public static void main(String[] args) {
		int port = 6666;
		try {
			Thread t = new GreetingServer(port);
			t.start();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public GreetingServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		
		while(true) {
			try {
				System.out.println("Waiting for client...");
				Socket server = serverSocket.accept();
				System.out.println("Just connected...");
				DataInputStream in = new DataInputStream(server.getInputStream());
				DataOutputStream out = new DataOutputStream(server.getOutputStream());
				server.close();
			
			
			} catch(SocketTimeoutException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
