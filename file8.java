import java.util.Scanner;
class file8
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        for(int i=1;i<=size;i++) {
            for (int j = 1; j <=i; j++)
            {
                System.out.print(" ");
            }
            for(int k=size-i;k>=0;k--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}