public class Account{
    private Client client;
    private double balance;

    public void showAccountData(){
        client.printClientData();
        System.out.println("Balance: " + balance + " R$");
    }

    //Constructor to instance objects type Client in class Main
    public Account(Client client, double balance){
        if(balance < 0) {
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
    public void doOperation(Operation operation){
        //Precisamos verificar o tipo da operação
        if(operation.getType() == 'D'){
            balance += operation.getValue();
            //Se não for do tipo D (Deposit), precisa ser do tipo W(Withdrawal)
        }else if(operation.getType() == 'W'){
            //Aqui é tipo: ok, é uma retirada, mas você tem saldo suficiente?
            if(balance >= operation.getValue()){
                balance -= operation.getValue();
                //Caso a verificação do saldo dê insuficiente, printará essa mensagem
            }else{
                System.out.println("Saldo insuficiente para operação");
            }
            //Caso a verificação do tipo de operação não seja nem D nem R, será uma operação inválida
        }else{
            System.out.println("Tipo de operação inválida");
        }
    }
}
