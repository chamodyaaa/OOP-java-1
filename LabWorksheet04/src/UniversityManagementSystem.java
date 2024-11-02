public class UniversityManagementSystem {
    public static void main(String[] args) {
        Lecturer deptHead = new Lecturer("Dr. Smith", "Head of Department", null);
        Department softwareEngineering = new Department("Software Engineering", deptHead);


        Degree computerScience = new Degree("Computer Science", 120);


        Lecturer courseLecturer = new Lecturer("Prof. Johnson", "Senior Lecturer", softwareEngineering);
        Course oopCourse = new Course("Object-Oriented Programming", "Full-Time", 30, courseLecturer, computerScience);


        computerScience.offerCourse(oopCourse);
        softwareEngineering.offerCourse(oopCourse);


        softwareEngineering.addLecturer(deptHead);
        softwareEngineering.addLecturer(courseLecturer);


        Student student1 = new Student("Alice Brown", "CS123", "2021",computerScience);
        student1.enrollCourse(oopCourse);


        System.out.println("    Department Information...  ");
        softwareEngineering.displayInfo();

        System.out.println("\n   Degree Information...  ");
        computerScience.displayInfo();

        System.out.println("\n   Course Information...   ");
        oopCourse.displayInfo();

        System.out.println("\n   Lecturer Information... ");
        deptHead.displayInfo();
        courseLecturer.displayInfo();

        System.out.println("\n   Student Information   ");
        student1.displayInfo();
    }


}
