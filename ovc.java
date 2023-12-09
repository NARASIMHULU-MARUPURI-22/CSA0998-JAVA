class sum
{
    protected int n=5;
    sum()
    {
        int sum=0;
        for(int i=0;i<n;i++ )
            sum=sum+i;
        System.out.println("sum is "+sum);
    }
}
class calc extends sum
{

    calc()
    {
        super();
        int facct=1;
        for(int i=1;i<=n;i++ )
            facct=facct*i;
        System.out.println("factorial is "+facct);
    }
}

class ovc
{
    public static void main(String args[])
    {
        calc s=new calc();
    }
}