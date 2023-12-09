import java.util.Scanner;
class e5 {
    public static void main(String args[]) {
        String input;
        int numcount = 0, alphacount = 0, splcount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a input:");
        input = sc.nextLine();
        int n = input.length();
        System.out.println("Special Characters:");
        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                numcount += 1;
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                alphacount += 1;
            } else {
                splcount += 1;
                System.out.println(ch);
            }
        }
        System.out.println("Number of Special Characters: " + splcount);
    }
}
