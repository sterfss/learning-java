public class Conta{
    //atributos da classe
    private String cpf;
    private int numeroBanco;
    private double saldo;
    private boolean clienteEspecial;

    //Construtor para inicializar os valores
    public Conta (String cpf, int numeroBanco, double saldo, boolean clienteEspecial){
        this.cpf = cpf;
        this.numeroBanco = numeroBanco;
        this.saldo = saldo;
        this.clienteEspecial = clienteEspecial;
    }

    //Métodos Getter e Setters para acessar e modificar os atributos

    //Getter para o CPF do titular (Retorna o cpf)
    public String getcpf(){
        return cpf;
    }

    //Setter para o CPF do titular (Define qual o cpf)
    public void setcpf(String cpf){
        this.cpf = cpf;
    }

    //Getter nº do Banco (Retorna o numero do banco)
    public int getnumeroBanco(){
        return numeroBanco;
    }

    //Setter para o nº do Banco (Define qual o numero do banco)
    public void setnumeroBanco(int numeroBanco){
        this.numeroBanco = numeroBanco;
    }

    //Getter para o valor do saldo (Retorna o valor do saldo)
    public double getsaldo(){
        return saldo;
    }

    //Setter para o valor do saldo (Define qual o valor do saldo)
    public void setsaldo(double saldo){
        this.saldo = saldo;
    }

    public double calcularBonificação(){
        if (clienteEspecial){
            return saldo * 0.10;
        } else {
            return saldo * 0.05;
        }
    }

    public void transferir(Conta Destino, double valor){
        if (valor > 0 && valor <= saldo){
            this.sacar(valor);
            destino.depositar(valor);
        } 
    }

    //Método para depositar somente valores positivos
    public void depositar (double valor){
        if (valor > 0){
            saldo = saldo + valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de depósito inválido");
        }
    }

    //Método para sacar somente SE o valor na conta for igual ou superior ao valor do saque
    public void sacar (double valor){
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso");
        }
    }

    //Método para verificar o valor do saldo
    public void mostrarSaldo(){
        System.out.println("Saldo atual: R$ " + this.saldo);
    }

    //Método para verificar os dados da conta
    public void mostrarDados(){
        System.out.println("Titular: " + this.cpf);
        System.out.println("Número do banco: " + this.numeroBanco);
        System.out.println("Cliente especial: " + (clienteEspecial ? "Sim" : "Não"));
        System.out.println("Bonificação: " + calcularBonificação());
        mostrarSaldo();
    }
}
