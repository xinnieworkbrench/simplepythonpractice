package ManagementSystem;

public class Student {

    private String studentName; //Student ID

    private int studentAge;

    private char level;

    private String email;

    private boolean isMale;


    // Construstor
    public Student(String studentName, int studentAge, char level, String email, boolean isMale){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.level = level;
        this.email = email;
        this.isMale = isMale;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public char getLevel() {
        return level;
    }

    public void setLevel(char level) {
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
}
