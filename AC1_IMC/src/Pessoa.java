import java.text.DecimalFormat;

public class Pessoa {
    public String nome;
    public int anoNasc;
    public double peso;
    public double altura;
    public double aguaIdeal;

    public Pessoa(){
        this.nome = "";
        this.anoNasc = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.aguaIdeal = 0.0;
    }

    public Pessoa(String nome, int anoNasc, double peso, double altura, double aguaIdeal){
        this.nome = nome;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.altura = altura;
        this.aguaIdeal = aguaIdeal;
    }

    public int calcularIdade(){
        return 2025 - this.anoNasc;
    }

    public double calcularImc(){
     return this.peso / (this.altura * this.altura);
    }

    public double calcularAgua (){
        return this.peso * this.aguaIdeal;
    }

    public void mostrar(){
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("Olá " + this.nome + " , você tem " + calcularIdade() + " anos de idade!");
        System.out.println("Seu IMC é " + df.format(calcularImc()));
        System.out.println("Você precisa de: " + df.format(calcularAgua()) + " ml de água por dia");
    }
}

