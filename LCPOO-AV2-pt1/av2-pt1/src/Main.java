public class Main {
    public static void main(String[] args) throws Exception {
        Client c1 = new Client("Jhonas", "111.222.333-44", "Rua dos bobos, nº 0");
        Account ac1 = new Account(c1, 1000.6);
        Operation op1 = new Operation('D', 500.0);
        Operation op2 = new Operation('W', 500.0);
        Operation op3 = new Operation('W', 2000.1);

        ac1.doOperation(op1);
        ac1.doOperation(op2);
        ac1.doOperation(op3);

        System.out.println("Saldo final: " + ac1.getBalance() + "R$");
    }
}
