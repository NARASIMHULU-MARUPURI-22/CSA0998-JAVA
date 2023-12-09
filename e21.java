import java.util.Scanner;
class e21
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        for(int i=1;i<=size;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}