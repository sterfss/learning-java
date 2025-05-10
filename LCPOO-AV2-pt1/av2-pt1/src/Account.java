public class Account{
    private Client client;
    private double balance;

    //Constructor to instance objects type Client in class Main
    public Account(Client client, double saldoInicial){
        if(saldoInicial < 0) {
            throw new IllegalArgumentException("Balance can not be negative");
        }
        this.client = client;
        this.balance = balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void drawMoney(double value){
        if(value > 0 && balance >= balance){
            balance -= value;
        }
    }
    public void depositMoney(double value){
        if (value > 0){
            balance += value;
        }
    }
}
