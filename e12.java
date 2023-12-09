import java.util.Scanner;
public class e12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int row= sc.nextInt();
        System.out.println("Enter number of columns:");
        int col= sc.nextInt();
        int[][] mat1=new int[row][col];
        int[][] mat2=new int[row][col];
        int[][] result=new int[row][row];
        int i,j;
        System.out.println("Enter the elements for matrix1:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix2:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                mat2[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Addition of matrix is:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }
}