import java.util.Scanner;
class e8 {
    public static void main(String args[]) {
        String input1;
        char input2;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        input1 = sc.nextLine();
        System.out.println("Enter the character to be searched:");
        input2 = sc.next().charAt(0);
        int n = input1.length();
        for (int i = 0; i < n; i++)
        {
            char ch = input1.charAt(i);
            if (ch ==input2)
            {
                index=i+1;
            }
        }
        if(index>0)
        {
            System.out.println(input2 + "is found in string at index: " + index);
        }
        else
        {
            System.out.println("Character is not found");
        }
    }
}
