import java.util.*;
class e6 {
    public static void main(String[] args){
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word:");
        str = in.nextLine();
        int v=0,i;
        for(i=0;i<str.length();i++)
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                v++;
        System.out.println("the no of vowels in the string:"+v);

    }
}

