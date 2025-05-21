import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = sc.nextLine();
        System.out.println("Type your age: ");
        int age = sc.nextInt();
        sc.close();

        Person p = new Person(age, name);
        System.out.println("Person created: ");
        p.printPersonData();
    
    }
}
