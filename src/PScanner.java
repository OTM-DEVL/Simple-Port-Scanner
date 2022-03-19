import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class PScanner {
    public static void main(String[] args) throws Exception {
        String host = "localhost";
        InetAddress inetAddress = InetAddress.getByName(host);

        String hostName = inetAddress.getHostName();
        for (int port = 0; port <= 6000; port++) {
            try {
                Socket socket = new Socket(hostName, port);
                String text = hostName + " is listening on port " + port;
                System.out.println(text);
                socket.close();
            } catch (Exception e) {
                System.out.println(e.getMessage()+ port);
            }
        }
    }
}