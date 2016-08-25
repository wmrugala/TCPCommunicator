import java.io.*;
import java.net.*;

class Client {
	public static void main(String argv[]) throws Exception	{
		while(true) {
			Socket clientSocket = new Socket("localhost", 6789);
			String sentence;
			BufferedReader inFromUser = new BufferedReader( new InputStreamReader(System.in));
			DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			sentence = inFromUser.readLine();
			outToServer.writeBytes(sentence + '\n');
			System.out.println("Sent");
			clientSocket.close();
		}
		//
	}
}