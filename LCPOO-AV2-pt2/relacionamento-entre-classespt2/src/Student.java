public class Student{
    private String name;
    private int yOfbirth;
    private double globalAverage;

  @Override
    public String toString() {
    return "Nome: " + name + ", Ano de nascimento: " + yOfbirth + ", Média global: " + globalAverage;
}

    public Student(String name, int yOfbirth, double globalAverage){
        this.name = name;
        this.yOfbirth = yOfbirth;
        this.globalAverage = globalAverage;
    }
    public void printStudentData(){
        System.out.println(name);
        System.out.println(yOfbirth);
        System.out.println(globalAverage);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setYofBirth(int yOfbirth){
        this.yOfbirth = yOfbirth;
    }
    public int getYofBirth(){
        return yOfbirth;
    }
    public void setGlobalAverage(double globalAverage){
        this.globalAverage = globalAverage;
    }
    public double getGlobalAverage(){
        return globalAverage;
    }
}