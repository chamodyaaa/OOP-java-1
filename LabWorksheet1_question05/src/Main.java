import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of inner circle");
        double ri = scanner.nextDouble();
        System.out.println("Enter the radius of outer circle");
        double ro = scanner.nextDouble();
        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);
        double area = outerCircle.computeArea() - innerCircle.computeArea();
        System.out.println("The area which is required is equal to" + area);
    }
}