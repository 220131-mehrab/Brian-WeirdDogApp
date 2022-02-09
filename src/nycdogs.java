import java.io.File;
import java.util.Scanner;


class nycPets {
	public static void main(String[] args) throws Exception {
		if (args.length < 1) {
			System.out.println("\nError: No filename provided. HEY HEY HEY");
			System.out.println("\tUSAGE: java nycPets <filename>");
		} else {
			String filename = args[0];
			//System.out.println("Num of args: " + args.length);
			File nycdogs = new File(filename);
			Scanner sc = new Scanner(nycdogs);
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
		}
	}
}
