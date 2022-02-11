package WeirdDogApp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Nycdogs {
    String[] doggos = new String[1000];

    public Nycdogs(String filename) {
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\n");
            int i = 0;
            while (scanner.hasNext()) {
                doggos[i] = scanner.next();
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
