import java.util.Scanner;
class e46 {
    public static boolean isPowerOfThree(int n) {
        if(n<3)
            return false;

        while(n%3==0)
        {
            n/=3;
        }

        return n==1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if (isPowerOfThree(n))
            System.out.println(n + " is a Power of Three.");
        else
            System.out.println(n + " is not a Power of Three.");
    }
}