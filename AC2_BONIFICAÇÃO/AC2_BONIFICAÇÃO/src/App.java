public class App {
    public static void main(String[] args) throws Exception {
        
        Conta conta1 = new Conta ("624.482.444-24", 003, 15000);
        
        conta1.mostrarDados();

        conta1.sacar(5000);

        conta1.mostrarSaldo();

        conta1.depositar(700);

        conta1.mostrarSaldo();
    }
}
