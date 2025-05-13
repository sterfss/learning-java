public class President extends Collaborator{
    private int stocks;

    public President(String name, String cpf, double salary, int stocks){
        super(name, cpf, salary);
        this.stocks = stocks;
    }
    public void setStocks(int stocks){
        this.stocks = stocks;
    }
    public int getStocks(){
        return stocks;
    }
    @Override
     public double calculateBonus(){
        return this.salary * 0.10;
    }    

}
