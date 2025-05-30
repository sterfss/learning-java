import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       
       System.out.println("Enter genre ID: ");
       int id = scanner.nextInt();
       scanner.nextLine();

       System.out.println("Enter genre description: ");
       String desc = scanner.nextLine();

       Genre genre = new Genre(id, desc);
       String filePath = "genre.txt";

       genre.WriteInFile(filePath);
       System.out.println("Genre saved to file");

       System.out.println("Reading file content...");
       genre.ReadFile(filePath);

       scanner.close();

    }
}
