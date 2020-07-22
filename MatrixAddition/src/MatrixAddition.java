import java.util.*;
public class MatrixAddition {

	public static void main(String[] args) {
		System.out.println("Enter the row of the first matrix");
        Scanner s1= new Scanner(System.in);
        int row1 = s1.nextInt();
        System.out.println("Enter the column of the first matrix");
        int col1 = s1.nextInt();
        System.out.println("Enter the first matrix");
        int a[][]= new int[row1][col1];
        for(int i =0 ;i < row1;i++)
        {
        	for(int j =0 ;j < col1;j++)
            {
        		
        	  	a[i][j]= s1.nextInt();
          
            }
        }
        System.out.println("The first matrix is ");
        for(int i =0 ;i < row1;i++)
        {
        	for(int j =0 ;j < col1;j++)
            {
        		
        		System.out.print(a[i][j] + "\t");
          
            }
        	System.out.println();
        }
        System.out.println("Enter the row of the second matrix");
        int row2 = s1.nextInt();
        System.out.println("Enter the column of the second matrix");
        int col2 = s1.nextInt();
        System.out.println("Enter the second matrix");
        int b[][]= new int[row2][col2];
        for(int i =0 ;i < row2;i++)
        {
        	for(int j =0 ;j < col2;j++)
            {
        		
        	  	b[i][j]= s1.nextInt();
          
            }
        }
        System.out.println("The second matrix is ");
        for(int i =0 ;i < row2;i++)
        {
        	for(int j =0 ;j < col2;j++)
            {
        		
        		System.out.print(b[i][j] + "\t");
          
            }
        	System.out.println();
        }
        if(row1==row2 && col1==col2)
        {
        	int sum[][] = new int[row1][col1];
        	 System.out.println("The sum of 2 matrix is ");
        	for(int i =0 ;i < row2;i++)
            {
            	for(int j =0 ;j < col2;j++)
            	{
            		sum[i][j] = a[i][j] + b[i][j];
            		System.out.print(sum[i][j] + "\t");
            	}
            	System.out.println(); 
            }
        }
        else {
        	System.out.println("Matrix cannot be added because rows and columns does not match");
        }	
	}

}
