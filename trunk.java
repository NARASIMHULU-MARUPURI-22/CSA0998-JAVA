class a2thread extends Thread {
    public void run() {
        try
        {
            for(int i=1;i<=10;i++)
            {
                System.out.println("5X"+i+"="+i*5);
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class b2thread extends Thread {
    public void run() {
        try{
            for(int i=1;i<=10;i++)
            {
                System.out.println("10X"+i+"="+i*10);;
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}

class trunk
{
    public static void main(String[] args)
    {
        a2thread s=new a2thread();
        b2thread o=new b2thread();
        o.start();
        s.start();

    }
}