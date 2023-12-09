import java.util.*;
class tom {
    void get() {
        String s1, s2;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the user name :");
        s1 = s.nextLine();
        System.out.println("Renter the user name :");
        s2 = s.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("valid user name proceed:");
        }
        else
            System.out.println("Invalid retry:");
    }
}

class com
{
    public static void main(String[] args)
    {
        tom o=new tom();
        o.get();
    }
}