import java.util.Scanner;
class rect
{
    void area(int height, int width)
    {
        int res=height*width;
        System.out.println("area of rectangle is :"+res);
    }
}

class rectangle
{
    public static void main(String[] args)
    {
        int h,w;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the height:");
        h=s.nextInt();
        System.out.println("enter the width:");
        w=s.nextInt();
        rect o=new rect();
        o.area(h,w);
    }
}