import java.io.*;
import java.net.*;
import java.util.Scanner;

class Client {
	public static void main(String argv[]) throws Exception	{
			System.out.println("Podaj swój nick:");
			BufferedReader br = new BufferedReader( new InputStreamReader(System.in)); 
			String nick = br.readLine();
		while(true) {
			String sentence;
			BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
			sentence = inFromUser.readLine();
			sentence = nick + ": " + sentence;
			Socket clientSocket = new Socket("localhost", 6789);
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			outToServer.writeBytes(sentence + '\n');
			System.out.println("Sent");
			clientSocket.close();
		}
		//
	}
}