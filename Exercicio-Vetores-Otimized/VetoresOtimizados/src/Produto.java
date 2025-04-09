public class Produto {
    public String codigo;
    public double peso;
    public double valor;

    public Produto(String codigo, double peso, double valor){
        this.codigo = codigo;
        this.peso = peso;
        this.valor = valor;
    }

    public void informacoesProduto(){
        System.out.println("Código: " + this.codigo);
        System.out.println("Peso: " + this.peso);
        System.out.println("Valor: " + "R$"+ this.valor);
    }

}