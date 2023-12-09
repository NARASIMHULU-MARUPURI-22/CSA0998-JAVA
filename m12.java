import java.util.Scanner;
import java.util.Arrays;
class m12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter the nth value:");
        int n = s.nextInt();
        int mm = arr[size - n];
        System.out.println("the mth max num is:"+mm);
    }
}