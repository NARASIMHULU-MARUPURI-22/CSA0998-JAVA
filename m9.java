import java.util.Scanner;
public class m9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to exit...");
        int num;
        int positiveCount = 0;
        int negativeCount = 0;
        int positiveSum = 0;
        int negativeSum = 0;
        while (true) {
            System.out.println("Enter the number:");
            num = sc.nextInt();
            if (num == -1) {
                break;
            }
            if (num >= 0) {
                positiveSum += num;
                positiveCount++;
            } else {
                negativeSum += num;
                negativeCount++;
            }
        }
        if (positiveCount > 0) {
            double positiveAverage = (double) positiveSum / positiveCount;
            System.out.println("The average of positive numbers is: " + positiveAverage);
        } else {
            System.out.println("No positive numbers entered.");
        }
        if (negativeCount > 0) {
            double negativeAverage = (double) negativeSum / negativeCount;
            System.out.println("The average of negative numbers is: " + negativeAverage);
        } else {
            System.out.println("No negative numbers entered.");
        }
        sc.close();
    }
}
