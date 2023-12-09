import java.util.Scanner;

class testx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] array = new int[100];
        int num, c = 0, n, i, k = 0;
        int a[] = new int[100];
        System.out.println("enter number:");
        num = s.nextInt();
        System.out.println("enter nth value:");
        n = s.nextInt();

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                a[c] = i;
                c++;
            }
        }
        System.out.println(n + "th factor is: " + a[n-1]);
    }
}