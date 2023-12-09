import java.util.*;
class S
{
    public double total,aggreg,flag=0;
    public double s1,s2,s3,s4;
    void getmark()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks of sub1:");
        s1=s.nextDouble();
        System.out.println("Enter Marks of sub2:");
        s2=s.nextDouble();
        System.out.println("Enter Marks of sub3:");
        s3=s.nextDouble();
        System.out.println("Enter Marks of sub4:");
        s4=s.nextDouble();
    }
}
class verify extends S
{
    void calculat()
    {
        if(((s1<0 || s1>100)||(s2<0 || s2>100)||(s3<0 || s3>100)||(s4<0||s4>100)))
        {
            System.out.println("Enter proper marks piz");
        }
        else
        {
            total=s1+s2+s3+s4;
            System.out.println("total marks:"+total);
            aggreg=total/4;
            System.out.println("Avarage:"+aggreg);
            flag=1;
        }
    }
}
class grades extends verify
{
    void g()
    {
        if(flag==1)
        {
            if(aggreg>75)
            {
                System.out.println("Distinction");
            }
            else if(aggreg>=60 && aggreg<75)
            {
                System.out.println("First Divison");
            }
            else if(aggreg>=50 && aggreg<60)
            {
                System.out.println("Second Divison");
            }
            else if(aggreg>=40 && aggreg<50)
            {
                System.out.println("Third Divison");
            }
            else
            {
                System.out.println("Fail");
            }
        }
        else
        {
            System.out.println("The Marks Range is 0-100");
        }
    }
}

class out
{
    public static void main(String args[])
    {
        grades o=new grades();
        o.getmark();
        o.calculat();
        o.g();
    }
}