import java.util.*;
class e4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter the no. strings you want to Enter: ");
        n= sc.nextInt();
        String[] s1=new String[n];
        String temp;
        System.out.println("Enter the strings: ");
        for(int i=0;i<n;i++)
            s1[i]=sc.next();
        System.out.print("Enter the order D/A: ");
        char ch=sc.next().charAt(0);
        if(ch=='D'){
            for(int i=0;i<n-1;i++)
                for(int j=i+1;j<n;j++)
                    if(s1[i].compareTo(s1[j])<0)
                    {
                        temp=s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
        }
        if(ch=='A')
        {
            for(int i=0;i<n-1;i++)
                for(int j=i+1;j<n;j++)
                    if(s1[i].compareTo(s1[j])>0)
                    {
                        temp=s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
        }
        for(int i=0;i<n;i++)
            System.out.print(s1[i]+" "+"\n");
    }
}
