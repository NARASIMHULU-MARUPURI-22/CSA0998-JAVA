import java.util.Scanner;
public class e2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string representing an integer:");
        String inputString = s.nextLine();
        try {
            int convertedInteger = Integer.parseInt(inputString);
            System.out.println("Converted Integer: " + convertedInteger);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer string.");
        }
    }
}