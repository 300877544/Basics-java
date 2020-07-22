import java.util.Scanner;

public class MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number Of Rows");
         
        int rows = sc.nextInt();
         
        System.out.println("Enter The Number Of Columns");
         
        int cols = sc.nextInt();
        int a[][]= new int[rows][cols];
        int transpose[][]=new int[cols][rows];
        System.out.println("Enter The Matrix");
        for(int i =0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }
        System.out.println("The Matrix is = ");
        for(int i =0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		System.out.print(a[i][j]+ "\t");
        	}
        	 System.out.println();
        }
        for(int i =0;i<rows;i++)
        {
        	for(int j=0;j<cols;j++)
        	{
        		transpose[j][i]=a[i][j];
        	}
        
        }
        System.out.println("The Transpose of Matrix is = ");
        for(int i =0;i<cols;i++)
        {
        	for(int j=0;j<rows;j++)
        	{
        		System.out.print(transpose[i][j]+ "\t");
        	}
        	 System.out.println();
        }
	}

}
