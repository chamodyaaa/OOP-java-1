import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Lecturer departmentHead;

    private List<Course>  coursesOffering;
    private List< Lecturer> lecturersBelongsTo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department(String name, Lecturer departmentHead){
        this.name = name;
        this. departmentHead = departmentHead;
        this.coursesOffering = new  ArrayList<>();
        this.lecturersBelongsTo = new ArrayList<>();
    }

    public void displayInfo(){
        System.out.println("Department name: "+name);
        displayDepartmentHeadInfo();
        System.out.println("Courses Offered:");
        for (Course course : coursesOffering) {
            System.out.println(course.getName());
        }

    }
    public void appointDepartmentHead(Lecturer head){
        this.departmentHead = head;
    }

    public void displayDepartmentHeadInfo(){
        System.out.println("Department head: "+departmentHead.getName());
    }

    public void  offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void  addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void  removeLecturer(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }


}
