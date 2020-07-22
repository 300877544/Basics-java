import java.util.*;
public class EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		System.out.println("Enter the limit of first array");
		Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int a[] = new int[n1];
      
        System.out.println("Enter the first array");
        for(int i =0;i<n1;i++) {
        	Scanner s2 = new Scanner(System.in);
            a[i] = s2.nextInt();
        }
    	System.out.println("Enter the limit of secound array");
		Scanner s1 = new Scanner(System.in);
        int n2 = s1.nextInt();
        int b[] = new int[n2];
        System.out.println("Enter the second array");
        for(int i =0;i<n2;i++) {
        	Scanner s3 = new Scanner(System.in);
            b[i] = s3.nextInt();
        }
        boolean flag=true;
        if(a.length == b.length)
        {
        	for(int j =0; j< a.length;j++)
        	{
        		if(a[j]!=b[j])
        		{
        			flag=false;
        		}
        	}
        }
        else {
        	flag=false;
        }
        if(flag)
        {
        	System.out.println("Arrays are equal");
        }
        else {
        	System.out.println("Arrays are not equal");
        }
	}

}
