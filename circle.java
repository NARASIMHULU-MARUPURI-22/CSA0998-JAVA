import java.util.*;
class circle
{
    double radius;
    void area() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the radius:");
        radius = s.nextDouble();
    }
    void cal()
    {
        double result = 3.14*radius*radius;
        System.out.println("Area of rectangle=" +result);
    }
}
class r
{
    public static void main(String []arg)
    {
        circle obj=new circle();
        obj.area();
        obj.cal();
    }
}
