import java.util.Scanner;

public class file9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Reading elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Remove duplicates
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] == array[j]) {
                    // Shift elements to the left to remove the duplicate
                    for (int k = j; k < size - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    size--; // Reduce the size of the array
                    j--;    // Adjust the index to recheck the current position
                }
            }
        }

        // Displaying the non-duplicate items
        System.out.print("Non-duplicate items:\n[");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
