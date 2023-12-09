import java.util.*;
class supr
{
    int n;
    supr(int n)
    {
        this.n=n;
    }
    void display()
    {
        System.out.println("this is superclass out:"+n);
    }
}

class sub extends supr
{
    int n; // hiding
    sub(int spn,int sn)
    {
        super(spn);
        this.n=sn;
    }
    void display()
    {
        super.display();
        System.out.println("this is subclass out:"+n);
    }
}

class ss
{
    public static void main(String args[])
    {
        int n,sn;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the input number for superclass:");
        n=s.nextInt();
        System.out.println("enter the input number for subclass:");
        sn= s.nextInt();

        sub o=new sub(n,sn);
        o.display();
    }
}