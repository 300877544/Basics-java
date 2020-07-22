import java.util.Scanner;

public class arraylargestvalue {

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
        int large = maximum(a);
        System.out.println("Maximum number from array is " + large);
	}
public static int maximum(int a[])
{
	int max=0;
    for(int i=0;i<a.length;i++)
    {
        if(a[i]>=a[max])
        max=i;
        
    }
    return (a[max]);
	
}
}
