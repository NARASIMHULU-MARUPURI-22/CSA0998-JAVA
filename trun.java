import java.util.*;
class aathread extends Thread {
    public void run() {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no:");
        n=s.nextInt();
        try
        {
            Thread.sleep(1000);
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+"X"+i+"="+i*n);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class bbthread extends Thread {
    public void run() {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the no:");
        n=s.nextInt();

        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println(n+"X"+i+"="+i*n);;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class trun
{
    public static void main(String[] args)
    {
        aathread s=new aathread();
        bbthread o=new bbthread();
        o.start();
        s.start();

    }
}