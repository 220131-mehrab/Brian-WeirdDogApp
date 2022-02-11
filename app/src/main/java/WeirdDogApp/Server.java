package WeirdDogApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    ServerSocket server;

    public Server(int port) {
        try {
            server = new ServerSocket(port);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run(Nycdogs nycdogs) {
        while (server.isBound()) {
            try {
                Socket socket = server.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                for (String doggos: nycdogs.doggos) {
                    out.println(doggos);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
