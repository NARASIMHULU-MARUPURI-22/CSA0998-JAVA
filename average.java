import java.util.*;
class average
{
    public static void main(String args[])
    {

        int a[]=new int[20];
        double sum=0,avg;
        int n,i;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the num of elements:");
        n=s.nextInt();
        System.out.println("enter the  "+n+"\telements:");
        for(i=0;i<n;i++)
            a[i]=s.nextInt();

        for(i=0;i<n;i++)
            sum=sum+a[i];

        avg=sum/n;
        System.out.println("average :"+avg);

    }
}