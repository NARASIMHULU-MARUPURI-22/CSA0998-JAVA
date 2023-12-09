import java.util.Scanner;
class file4
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size:");
        int size=s.nextInt();
        for(int i=1;i<=size;i++) {
            for(int k=size-i;k>=1;k--)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) {
                System.out.print( i+" ");
            }
            System.out.println("");
        }
        for(int i=size-1;i>=1;i--) {
            for(int k=0;k<size-i;k++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j < i+1; j++) {
                System.out.print( i+" ");
            }
            System.out.println("");
        }
    }
}