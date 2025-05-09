import java.util.ArrayList;

public class Academia {
    public String nome;
    public ArrayList<Cliente> clientes;

    public Academia(String nome){
        this.nome = nome;
        this.clientes = new ArrayList<>();
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removerClientePorId(int id) {
        return clientes.removeIf(cliente -> cliente.getId() == id);
    }

    public int getTotalClientes() {
        return clientes.size();
    }

    public ArrayList<Cliente> clientesApos2000() {
        ArrayList<Cliente> resultado = new ArrayList<>();
        for (Cliente cliente : clientes) {
            if (cliente.getAnoNascimento() > 2000) {
                resultado.add(cliente);
            }
        }
        return resultado;
    }

    public void removerClientesAntes1990() {
        clientes.removeIf(cliente -> cliente.getAnoNascimento() < 1990);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}

