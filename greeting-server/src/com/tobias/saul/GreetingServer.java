package com.tobias.saul;

import java.io.IOException;
import java.net.ServerSocket;

public class GreetingServer {
	
	private ServerSocket serverSocket;
	
	public GreetingServer(int port) throws IOException {
		serverSocket = new ServerSocket(port);
		serverSocket.setSoTimeout(10000);
	}
	
	public void run() {
		
	}

}
