import java.util.Scanner;

public class PairsOfElementsInArray {
//find all pairs of elements in an array whose sum is equal to given number
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
        	System.out.print(a[i] + " ");
        }
        System.out.println("\nEnter the element whose sum is ");
        int inputnumber = s.nextInt();
        findThePairs(a, inputnumber);

	}

	public static void findThePairs(int[] a, int inputnumber) {
		for(int i =0 ;i< a.length;i++)
		{
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==inputnumber)
				{
					  System.out.println(a[i] + " + " + a[j] + " = " + inputnumber);
				}
			}
		}
		
	}

}
