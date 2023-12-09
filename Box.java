class Box
{
    double width,height,depth;
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    double volume()
    {
        return width*height*depth;
    }
    public static void main(String[] arg)
    {
        Box obj=new Box(10.5,20.5,30.4);
        double res3=obj.volume();
        System.out.println("result3: "+res3);
    }
}
