import java.util.ArrayList;
import java.util.List;

public class Degree {
    private String name;
    private int numberOfStudents;
    private List<Course>  coursesOffering;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Degree(String name, int numberOfStudents){
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering = new  ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Number of students: "+numberOfStudents);
        listCoursesOffering();

    }

    public void offerCourse(Course course){
        coursesOffering.add(course);

    }
    public void  withdrawCourse(Course course){
        coursesOffering.remove(course);

    }
    public void listCoursesOffering(){
        System.out.println("Courses Offering:");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }

    }








}
