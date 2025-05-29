import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Genre genre = new Genre(1, "horror");

        String filePath = "Genre.txt";
        genre.WriteInFile(filePath);
        System.out.println("Reading file...");
        genre.ReadFile(filePath);
    }
}
