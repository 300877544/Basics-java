import java.util.Arrays;
import java.util.Scanner;

public class ArrayReverse {

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
        reverseArray(a);
	}

	public static void reverseArray(int[] a) {
		
		for(int i = 0; i< a.length/2;i++)
		{
			int temp = a[i];
			a[i] = a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
