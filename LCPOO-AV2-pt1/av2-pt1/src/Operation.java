public class Operation {
    public char type;
    public double value;

    public Operation(char type, double value){
        this.type = type;
        this.value = value;
    }
    public char getType(){
        return type;
    }
    public void setType(char type){
        this.type = type;
    }
    public double getValue(){
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
}
