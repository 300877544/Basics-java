import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.println("Enter the limit of array");
		Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int[] a = new int[limit];
        System.out.println("Enter the array");
        for(int i =0 ;i < limit; i++)
        {
        	Scanner sc = new Scanner(System.in);
            a[i]  = sc.nextInt();
        }
        System.out.println("Array is");
        for(int i =0 ;i < limit; i++)
        {
        	System.out.println(a[i] + " ");
        }
        reversearray(a);

	}

	public static void reversearray(int[] a) {
		int i, j;
		for(i=0,j=a.length-1;i<j;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("Array reversed");
		for(int val : a)
		{
			System.out.println(val+" ");
		}
		
	}

	

}
