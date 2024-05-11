package ManagementSystem;

import java.util.ArrayList;

public class ClassRoom {
    private String className;
    private Teacher teacherInformation;
    private ArrayList<Student> students;
    public ClassRoom(Teacher teacher, String className) {
        this.teacherInformation = teacher;
        this.className = className;
        students = new ArrayList<Student>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }

    public int numOfStudents(){
        return students.size();
    }
}
