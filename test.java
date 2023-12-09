class a
{
    String s1= "I Love java";
    String s2="java";
    String s3="JAVA";
    String s4,s5,s6,s7,s8;
    int s9,s10,s14;
    char s13;
    boolean s11,s12;
    void t()
    {
        s4=s1.toLowerCase();
        s5=s1.toUpperCase();
        s6=s1.replace('o','i');
        s7=s1.substring(2);
        s8=s1.substring(2,6);
        s9=s1.indexOf('L');
        s10=s1.length();
        s11=s2.equals(s3);
        s12=s2.equalsIgnoreCase(s3);
        s13=s1.charAt(2);
        s14=s2.compareTo(s3);
        System.out.println("the string is :"+s4);
        System.out.println("the string is :"+s5);
        System.out.println("the string is :"+s6);
        System.out.println("the string is :"+s7);
        System.out.println("the string is :"+s8);
        System.out.println("the string is :"+s9);
        System.out.println("the string is :"+s10);
        System.out.println("the string is :"+s11);
        System.out.println("the string is :"+s12);
        System.out.println("the string is :"+s13);
        System.out.println("the string is :"+s14);

    }
}

class test
{
    public static void main(String[] args)
    {
        a s=new a();
        s.t();
    }
}