// Deze imports zijn nodig om Java te vertellen welke gereedschappen we gaan gebruiken
// Scanner = voor het lezen van bestanden, File = voor het werken met bestanden
import java.util.Scanner;
import java.io.File;

public class BasicReader {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(new File("uitvoer.txt"));

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
} 