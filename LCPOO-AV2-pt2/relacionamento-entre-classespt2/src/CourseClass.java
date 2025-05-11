import java.util.ArrayList;
import java.util.List;

public class CourseClass {
    public ArrayList<Student> students;
    public String course;

    public CourseClass(String course){
        this.course = course;
        this.students = new ArrayList<>();
    }

    public void setCourse(String course){
        this.course = course;
    }
    public String getCourse(){
        return course;
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public Student getStudentHighestAverage(){
        if(students.isEmpty()) return null;

        Student bestStudent = students.get(0);
        for (Student a: students){
            if(a.getGlobalAverage() > bestStudent.getGlobalAverage()){
                bestStudent = a;
            }
        }
        return bestStudent;
    }
    public Student getYoungerStudent(){
        if(students.isEmpty()) return null;

        Student youngerStudent = students.get(0);
        for(Student a: students){
            if(youngerStudent.getYofBirth() < a.getYofBirth()){
                youngerStudent = a;
            }
        }
        return youngerStudent;
    }
}

