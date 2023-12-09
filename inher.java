import java.util.*;
class c
{
    protected float r,h;
    public double carea;
    void getr()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("eneter the radius:");
        r=s.nextFloat();
        System.out.println("eneter the height:");
        h=s.nextFloat();
    }

    void ccal()
    {
        carea=3.14*r*r;
    }
}

class cylinder extends c
{
    protected double cyvol;
    void cycal()
    {
        cyvol=carea*h;
    }
}

class cone extends cylinder
{
    public double convol;
    void conecal()
    {
        convol= cyvol/3;
    }

    void display()
    {
        System.out.println("The area of circle:"+ carea);
        System.out.println("The Volume of cylinder:"+ cyvol);
        System.out.println("The volume of cone:"+ convol);
    }
}

class inher
{
    public static void main (String[] args)
    {
        cone obj=new cone();
        obj.getr();
        obj.ccal();
        obj.cycal();
        obj.conecal();
        obj.display();

    }
}