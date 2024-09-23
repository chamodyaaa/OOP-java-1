import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length in centimeters :");
        double length = input.nextDouble();
        double feet = length/30.48;
        double inch = (length%30.48)/2.54;
        System.out.println("Length : "+feet+" feet and " +inch+" inches.");

    }
}
