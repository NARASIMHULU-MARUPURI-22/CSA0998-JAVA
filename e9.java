import java.util.Scanner;
class e9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
// Prompt user for input
        System.out.println("Enter the word:");
        String word = sc.nextLine();
// Convert the word to a character array
        char[] charArray = word.toCharArray();
// Sort the character array in reverse order
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] < charArray[j]) {
// Swap characters if they are out of order
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        for(int i=0;i<=charArray.length - 1;i++)
            System.out.print(charArray[i]+" ");
    }
}
