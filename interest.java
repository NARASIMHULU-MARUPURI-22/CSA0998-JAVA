import java.util.*;
class interest
{
    float p,t,r,si;
    void area() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the principel amount:");
        p= s.nextFloat();
        System.out.println("Enter the time:");
        t=s.nextFloat();
        System.out.println("Enter the Rate:");
        r=s.nextFloat();
    }
    void cal()
    {
        float result=p*t*r/100;
        System.out.println("Simple Interest=" +result);
    }
}
class Inter
{
    public static void main(String []arg)
    {
        interest obj=new interest();
        obj.area();
        obj.cal();
    }
}
