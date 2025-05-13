public class Collaborator{
    protected String name;
    protected String cpf;
    protected double salary;

    public Collaborator(String name, String cpf, double salary){
        this.name = name;
        this.cpf = cpf;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return cpf;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public double calculateBonus(){
        return this.salary * 0.05;
    }    
}