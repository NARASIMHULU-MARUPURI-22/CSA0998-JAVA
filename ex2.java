import java.util.*;
class ex2
{
    public static void main(String args[])
    {

        int a[]=new int[4];
        Scanner s=new Scanner(System.in);
        System.out.println("enter the elements:");
        for(int i=0;i<a.length;i++)
            a[i]=s.nextInt();

        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}