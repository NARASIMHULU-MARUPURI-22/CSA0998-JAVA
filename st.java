import  java.util.*;
class st
{
    public static void main(String[] args)
    {
        String s1,s2,s3;
        int len,i,c=0;
        char s4;
        Scanner s=new Scanner(System.in);
        System.out.println("enter ur name piz: ");
        s1=s.nextLine();
        s2=s1.toLowerCase();
        s3=s1.toUpperCase();
        s4=s1.charAt(5);
        len=s1.length();
        System.out.println("the string enterd is :"+s1);

        for(i=0;i<len;i++)
        {
            if(s1.charAt(i)=='e' || s1.charAt(i)=='E')
            {
                c++;
            }
            else
            {
                c=0;
            }
        }
        if(c>0)
            System.out.println("------The letter 'E,e' is present in the name:------------");
        else
            System.out.println("--------------The letter 'E,e' is not present in the name:------------");

        System.out.println("the string in lpower case:"+s2);
        System.out.println("the string in upper case :"+s3);
        System.out.println("the letter at 5th index:"+s4);
        System.out.println("the length of string is :"+len);
    }
}