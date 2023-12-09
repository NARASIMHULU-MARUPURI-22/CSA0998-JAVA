    import java.util.Scanner;
    import java.lang.Math;
    public class m13 {
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            System.out.print("Enter a Binary number : ");
            int n=s.nextInt();
            int dec = 0, i = 0, rem;
            while (n!=0) {
                rem = n % 10;
                n /= 10;
                dec += rem * Math.pow(2, i);
                ++i;
            }
            System.out.println("Decimal value is : "+dec);
            int oct = 0, j = 1;
            while (dec!= 0)
            {
                oct += (dec % 8) * j;
                dec /= 8;
                j *= 10;
            }
            System.out.println("oct value is : "+oct);
        }

    }
