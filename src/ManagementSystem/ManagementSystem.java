package ManagementSystem;

public class ManagementSystem {

    public static void main(String[] args) {
        //1. define a student,
        Student student1 = new Student("Tony", 15, 'A', "123@email.com", true);
        //2. define a teacher
        Teacher teacher1 =  new Teacher("Any", "Prof");
        //3. define the classroom
        ClassRoom CSCI = new ClassRoom(teacher1,"1933");
        //4. add student to classroom
        CSCI.addStudent(student1);
        //5. check how many students in the classroom
        System.out.println("the class size is " + CSCI.numOfStudents());
    }
}


