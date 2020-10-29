import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilesInlezen {

    public static void main(String[] arg) {
        try {
            File f = new File("Hello.txt");
            Scanner s = new Scanner(f);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (FileNotFoundException a) {
            System.out.println("Helaas, het bestand kan niet gevonden worden. De reden is: " + a);

        } finally {
            System.out.println("Het programma is afgelopen");
        }


    }

}
