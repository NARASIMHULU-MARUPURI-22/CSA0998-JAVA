package easy;
import java.util.*;
class e4
{
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of words:");
        n = sc.nextInt();
        String[] arr= new String[n];
        System.out.println("Enter words:");
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLine();
        }
        System.out.println("Enter choice:A/D");
        char ch=sc.next().charAt(0);
        if(ch=='A')
        {
            for(int i=0;i<n;i++)
            {
                for( int j=i+1;j<n;j++)
                {
                    if(arr[i].compareTo(arr[j])>0)
                    {
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else if(ch=='D')
        {
            for(int i=0;i<n;i++)
            {
                for( int j=i+1;j<n;j++)
                {
                    if(arr[i].compareTo(arr[j])<0)
                    {
                        String temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            for(int i=0;i<n;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else
        {
            System.out.println("Invalid Choice!, Please Enter A/D");
        }


    }
}
