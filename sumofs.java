import java.util.*;
class SumofSeries1
{
    int n,sum=0;
    void sum()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        n=s.nextInt();
    }
    void cal()
    {
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum = "+sum);
    }
    public static void main(String[] arg)
    {
        SumofSeries1 obj=new SumofSeries1();
        obj.sum();
        obj.cal();
    }
}
