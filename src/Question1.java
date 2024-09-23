import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the odd length word :");
        String text = input.next();
        int length = text.length();
        while(length%2 == 0) {
            System.out.println("Enter the odd length word :");
            text = input.next();
            length = text.length();
        }
        int midIndex = ((length + 1) / 2) - 1;
        System.out.println("Charactor in the middle id :" + text.charAt(midIndex));
    }
}
