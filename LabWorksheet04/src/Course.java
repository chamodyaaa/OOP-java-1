public class Course {
    private String  name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer  lecturerInCharge;
    private Degree  degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled, Lecturer lecturerInCharge, Degree degreeBelongsTo){
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
        this.lecturerInCharge = lecturerInCharge;
        this.degreeBelongsTo = degreeBelongsTo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void displayInfo(){
        System.out.println("Course name: "+name);
        System.out.println("Enroll type: "+enrollType);
        System.out.println("Number of students enrolled: "+numberOfStudentsEnrolled);
        System.out.println("Lecturer in charge: "+lecturerInCharge);
        System.out.println("Degree belongs to: "+degreeBelongsTo);
    }

    public void  addLecturerInCharge(Lecturer lecturer) {
        this.lecturerInCharge = lecturer;
    }

    public void  removeLecturerInCharge(){
        this.lecturerInCharge = null;
    }

    public void   addDegreeBelongsTo(Degree degree){
        this.degreeBelongsTo = degree;
    }

    public void   removeDegreeBelongsTo(){
        this.degreeBelongsTo = null;

    }



}
