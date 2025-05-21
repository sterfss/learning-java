public class Person{
    public int age;
    public String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void printPersonData(){
        System.out.println("Age: " + age);
        System.out.println("Name: " + name);
    }
}