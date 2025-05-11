public class Client{
    protected String name;
    protected String cpf;
    protected String address;

    public Client(String name, String cpf, String address){
        this.name = name;
        this.cpf = cpf;
        this.address = address;
    }

    public void printClientData(){
        System.out.println("Name: " + name);
        System.out.println("CPF: " + cpf);
        System.out.println("Address: " + address);
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
    public void setaddress(String address){
        this.address = address; 
    }
    public String getaddress(){
        return address;
    }
} 