package secondLargestinArray;

import java.util.Scanner;

public class secondLargest {

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
        int large = secondlargest(a);
        System.out.println("Second largest number is  " + large);

	}

	public static int secondlargest(int[] a) {
		int firstlargest, secondlargest;
		if(a[0]>a[1])
		{
			firstlargest=a[0];
			secondlargest=a[1];
		}
		else {
			firstlargest=a[1];
			secondlargest=a[0];
		}
		for(int i=2; i<a.length;i++)
		{
			if(a[i]>firstlargest) {
				secondlargest=firstlargest;
				firstlargest=a[i];
				
			}
			else if(a[i]<firstlargest && a[i]>secondlargest)
			{
				secondlargest=a[i];
			}
		}
		return secondlargest;
	}

}
