public class App {
    public static void main(String[] args) throws Exception {
        

        Academia academia = new Academia("Academia VidaFit");

     
        Cliente cliente1 = new Cliente(1, "Alice", 1995, "1199999-1111");
        Cliente cliente2 = new Cliente(2, "Bruno", 2002, "1198888-2222");
        Cliente cliente3 = new Cliente(3, "Carla", 1985, "1197777-3333");

        academia.cadastrarCliente(cliente1);
        academia.cadastrarCliente(cliente2);
        academia.cadastrarCliente(cliente3);

        
        System.out.println("Clientes atuais");
        academia.listarClientes();

        academia.removerClientePorId(1);

        System.out.println("Após remover cliente com ID 1");
        academia.listarClientes();

        System.out.println("Clientes nascidos após 2000");
        for (Cliente c : academia.clientesApos2000()) {
            System.out.println(c);
        }

        academia.removerClientesAntes1990();

        System.out.println("Após remover clientes antes de 1990");
        academia.listarClientes();

        System.out.println("Total de clientes atuais: " + academia.getTotalClientes());
    }
}
    

