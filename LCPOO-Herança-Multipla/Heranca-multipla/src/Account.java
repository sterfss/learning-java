public class Account implements Security{
    private String cpf;
    private int balance;
    private String password;

    public Account(String cpf, int balance, String password){
        this.cpf = cpf;
        this.balance = balance;
        this.password = password;
    }
    public boolean verifyPassword(String inputPassword){
        return this.password.equals(inputPassword);
    }
    @Override
    public void successMessage(){
        System.out.println("Transaction made successfully");
    }
    @Override
    public void failureMessage(){
        System.out.println("Transaction failed");
    }
    public void withdrawMoney(int value, String inputPassword){
        if(verifyPassword(inputPassword)){
            if (value > 0 && value <= balance){
                balance -= value;
                successMessage();
            }else{
                failureMessage();
            }
        }else{
            failureMessage();
        }
    }
    public void depositMoney(int value, String inputPassword){
        if(verifyPassword(inputPassword)){
            if(value > 0){
                balance += value;
            }else{
                failureMessage();
            }
        }else{
            failureMessage();
        }
    }
}

