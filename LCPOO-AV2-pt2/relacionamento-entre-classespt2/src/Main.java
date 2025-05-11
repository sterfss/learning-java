public class Main {
    public static void main(String[] args) throws Exception {
        CourseClass class1 = new CourseClass("Análise e Desenvolvimento de Sistemas");

        Student s1 = new Student("Clebin", 2003, 8.9);
        Student s2 = new Student("Sarah", 2004, 8.2);
        Student s3 = new Student("Paulo", 2005, 9.5);
        Student s4 = new Student("Lucas", 2006, 6.5);

        class1.addStudent(s1);
        class1.addStudent(s2);
        class1.addStudent(s3);
        class1.addStudent(s4);
        
        System.out.println("Student with highest average: ");
        class1.getStudentHighestAverage().printStudentData();
        System.out.println("Youngest student in class: ");
        class1.getYoungerStudent().printStudentData();
    }
}
