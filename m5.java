import java.util.Scanner;
public class m5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number:");
        if (sc.hasNextInt())
        {
            int decimalNumber = sc.nextInt();
            String binaryNumber = Integer.toBinaryString(decimalNumber);
            System.out.println("Binary Number = " + binaryNumber);
            String octalNumber = Integer.toOctalString(decimalNumber);
            System.out.println("Octal = " + octalNumber);
        } else
        {
            System.out.println("Invalid input. Please enter a valid decimal number.");
        }
    }
}