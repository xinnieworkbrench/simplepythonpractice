package ManagementSystem;

public class Teacher {

    private String teacherName;

    private String title;

    public Teacher(String teacherName, String title) {
        this.teacherName = teacherName;
        this.title = title;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
