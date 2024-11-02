import java.util.ArrayList;
import java.util.List;

class Lecturer extends Person {
    private String position;
    private Department department;

    private List<Course> coursesTeaching;

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setDepartment(Department department) {
        this.department = department;
    }

    public Lecturer(String name, String position, Department department) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = new ArrayList<>();
    }
    @Override
    public void displayInfo(){
        System.out.println("Name: "+getName());
        System.out.println("Position: "+position);
        displayDepartmentInfo();
    }

    public void displayDepartmentInfo(){
        System.out.println("Department: "+department.getName());
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);
    }
    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        System.out.println("Courses: ");
        for (Course course : coursesTeaching){
            System.out.println(course.getName());
            System.out.println(course.getEnrollType());
            System.out.println(course.getNumberOfStudentsEnrolled());
        }
    }









}
