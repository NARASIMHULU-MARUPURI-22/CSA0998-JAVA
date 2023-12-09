import java.util.*;
public class crcount {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int uc = 0,lc= 0,nc= 0;
        System.out.println("Enter characters. Enter '*' to stop:");
        while (true) {
            char c = s.next().charAt(0);
            if (c == '*') {
                break;
            } else if(c>='A' && c<='Z') {
                uc++;
            } else if(c>='a' && c<='z') {
                lc++;
            } else if(Character.isDigit(c))
            {
                nc++;
            }
        }
        System.out.println("Uppercase letters: " + uc);
        System.out.println("Lowercase letters: " + lc);
        System.out.println("Numbers: " + lc);
    }
}

