import java.util.StringTokenizer;
public class  Q05 {
    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        String input = System.console().readLine();
        String cleanInput = input.replaceAll("[^a-zA-Z]",
                "").toLowerCase();
        StringTokenizer tokenizer = new
                StringTokenizer(cleanInput);
        StringBuilder reversed = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            reversed.insert(0, tokenizer.nextToken());
        }
        if (cleanInput.equals(reversed.toString())) {
            System.out.println("The sentence is a palindrome.");
        } else {
            System.out.println("The sentence is not a palindrome.");
        }
    }
}