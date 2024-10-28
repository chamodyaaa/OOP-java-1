import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter an integer: ");
            number = scanner.nextInt();
            if (number>=0){
                int digitCount = countDigit(number);
                System.out.println("Total Digits "+ digitCount);
            }

        }while (number>=0);
        System.out.println("Exit");
    }
    public static int countDigit(int number){
        int count = 0;
        if(number==0){
            return 1;
        }
        number = Math.abs(number);

        while (number>0){
            number = number / 10;
            count++;
        }
        return count;
    }
}