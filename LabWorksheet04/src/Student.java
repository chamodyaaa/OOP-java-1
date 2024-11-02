import java.util.ArrayList;
import java.util.List;

class Student extends Person {
    private String studentID;
    private String year;
    private Degree degree;
    private List<Course> courseEnrolled;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Course> getCourseEnrolled() {
        return courseEnrolled;
    }

    public Student(String name, String studentID, String year, Degree degree){
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.courseEnrolled = new ArrayList<>();

    }
    @Override
    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("StudentID: "+studentID);
        System.out.println("Year: "+year);
        displayDegreeInfo();
    }

    public void registerDegree(Degree degree){
        this.degree =degree;

    }
    public void displayDegreeInfo(){
        System.out.println("Degree: "+degree.getName());
    }

    public void enrollCourse(Course course){
        courseEnrolled.add(course);
    }

    public void unenrollCourse(Course course){
        courseEnrolled.remove(course);
    }

    public void listCourseEnrolled(){
        for (Course course : courseEnrolled){
            System.out.println(course.getName());
        }

    }











}
