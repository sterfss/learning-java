public class Main {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client("Jhonas", "111.222.333-44", "Rua dos bobos, nº 0");
        Account ac1 = new Account(c1, 1500.6);

        ac1.showAccountData();
    }
}
