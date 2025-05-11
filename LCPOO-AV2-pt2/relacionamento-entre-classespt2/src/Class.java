import java.util.ArrayList;
import java.util.List;

public class Class {
    public ArrayList<Student> students;
    public String course;

    public Class(String course){
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void addStudents(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }
}

