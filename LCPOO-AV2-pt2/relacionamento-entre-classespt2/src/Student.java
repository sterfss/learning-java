public class Student{
    private String name;
    private String yOfbirth;
    private double globalAverage;

    public Student(String name, String yOfbirth, double globalAverage){
        this.name = name;
        this.yOfbirth = yOfbirth;
        this.globalAverage = globalAverage;
    }
    public void studentData(){
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
    public void setYofBirth(String yOfbirth){
        this.yOfbirth = yOfbirth;
    }
    public String getYofBirth(){
        return yOfbirth;
    }
    public void setGlobalAverage(double globalAverage){
        this.globalAverage = globalAverage;
    }
    public double getGlobalAverage(){
        return globalAverage;
    }
}