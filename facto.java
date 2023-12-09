import java.util.*;
class facto {
    void fact(int n) {
        int i, fact = 1;
        for (i = 1; i <=n; i++) {
            fact = fact * i;
        }
        System.out.println("factorial:" + fact);
    }

}

class f{
    public static void main(String[] arg)
    {
        int number;
        Scanner s=new Scanner(System.in);
        System.out.print("enter:");
        number=s.nextInt();
        facto obj=new facto();
        obj.fact(number);
    }
}
