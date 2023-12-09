import java.util.Scanner;
import java.lang.Math;
class file7 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int n=s.nextInt();
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            for (int k = 1; k <= i; k++) {
                System.out.printf("%d  ", square);
                square=(int)(Math.pow(i+k,2));
            }
            System.out.println();
        }
    }
}
