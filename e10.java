import java.util.Scanner;
public class e10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        String result = input.replaceAll("[aeiouAEIOU]", " ");
        System.out.println("The string without vowels is: " + result);
        sc.close();
    }
}
