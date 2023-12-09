import java.util.*;
class e35
{
    public static void main(String[] args)
    {
        String original, reverse = "";
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string:");
        original=in.nextLine();
        System.out.println("Enter a letter to find:");
        char ch=in.nextLine().charAt(0);
        int length=original.length();
        for( int i=0;i<length;i++)
        {
            if(original.charAt(i)==ch)
            {
                System.out.println("the letter is found at index:"+(i+1));
            }
        }
    }
}