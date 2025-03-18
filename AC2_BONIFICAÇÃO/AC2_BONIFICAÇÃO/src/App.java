public class App {
    public static void main(String[] args) throws Exception {
        
        Conta conta1 = new Conta ("624.482.444-24", 001, 15000, true);
        Conta conta2 = new Conta ("123.456.789-10", 002, 18000, false);

        conta1.mostrarDados();
        System.out.println("");
        conta2.mostrarDados();
    }
}
