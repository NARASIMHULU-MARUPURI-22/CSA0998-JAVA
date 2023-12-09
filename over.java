class calcu
{
    protected int n;
    void get()
    {
        n=5;
    }
    void calcu()
    {
        int sum=0;
        for(int i=0;i<n;i++ )
            sum=sum+i;
        System.out.println("sum is "+sum);
    }
}
class factor extends calcu
{
    void calcu()
    {
        super.calcu();
        int facct=1;
        for(int i=1;i<=n;i++ )
            facct=facct*i;
        System.out.println("factorial is "+facct);
    }
}

class over
{
    public static void main(String args[])
    {
        factor s=new factor();
        s.get();
        s.calcu();
    }
}