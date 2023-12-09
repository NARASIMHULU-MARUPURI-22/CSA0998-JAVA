import java.util.Scanner;
class file11 {
    public static void main(String args[]) {
        int l, u;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter l");
        l = sc.nextInt();
        System.out.println("Enter u");
        u = sc.nextInt();
        int n = u - l;
        int[][] arr = new int[n + 1][2];
        int i, num = l;
        for (i = 0; i <= n; i++) {
            arr[i][0] = l + i;
            arr[i][1] = (l + i) * (l + i);
        }
        for (i = 0; i <= n; i++) {
            System.out.print("(" + arr[i][0] + " " + arr[i][1] + "), ");
        }
    }
}