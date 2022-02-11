package WeirdDogApp;

public class App {
    public static void main(String[] args) {
        String filename = args[0];
        Nycdogs nycdogs = new Nycdogs(filename);
        Server server = new Server(8080);
        server.run(nycdogs);
    }
}

