import java.net.*;
import java.io.*;

public class SimpleServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1234);
        Socket client = server.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        String message = in.readLine();
        System.out.println("Client says: " + message);

        in.close();
        client.close();
        server.close();
    }
}