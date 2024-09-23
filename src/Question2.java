import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the full name in the format first middle last");
        String fullName = input.nextLine();

        int firstIndex = fullName.indexOf(' ');
        int lastIndex = fullName.lastIndexOf(' ');

        String firstName =fullName.substring(0,firstIndex);
        String middleName = fullName.substring(firstIndex+1,lastIndex);
        String lastName =  fullName.substring(lastIndex+1);

        System.out.println(lastName+", "+firstName+" "+middleName.charAt(0)+".");
    }
}
