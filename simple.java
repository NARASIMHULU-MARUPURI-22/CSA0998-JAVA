import java.util.*;
class simpl {
    simpl (double p,double t,double r)
    {
        double s=(p*t*r)/100;
        System.out.println("Simple intreset:" + s);
    }
}

class simple
{
    public static void main(String[] args)
    {
        double p,t,r;
        Scanner s=new Scanner(System.in);
        System.out.print("enter p:");
        p=s.nextDouble();
        System.out.print("enter StockManagementSystem.java:");
        t=s.nextDouble();
        System.out.print("enter r:");
        r=s.nextDouble();
        simpl obj=new simpl(p,t,r);

    }
}