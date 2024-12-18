// A class that represents a student
public class Student {

    private String name;
    private String course;
    private int rollNumber;

    private void watchMovie() {
        System.out.println("Student is watching a movie");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
