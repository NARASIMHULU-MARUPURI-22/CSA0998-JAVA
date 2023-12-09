import java.util.Scanner;
class e7 {
    public static void main(String args[]) {
        String input;
        String vowels = "", consonants = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        input = sc.nextLine();
        int n = input.length();
        for (int i = 0; i < n; i++)
        {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                vowels +=(ch+" ");
            }
            else
            {
                consonants+=(ch+" ");
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}