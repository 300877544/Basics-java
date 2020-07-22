import java.util.Scanner;

public class MissingNumberInArray {
//If ‘n‘ is the positive number and ‘a‘ is an array of integers of length n-1 containing elements 
//	from 1 to n. Then find the missing number in ‘a’ in the range from 1 to n. Occurrence of each element 
//	is only once. If n = 8, then array ‘a’ will have 7 elements in the range from 1 to 8. 
//	For example {1, 4, 5, 3, 7, 8, 6}. One number will be missing in ‘a’ (2 in this case). 
//	You have to find out that missing number.
	public static void main(String[] args) {
		System.out.println("Enter the limit of the array");
		Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int a[] = new int[n1];
      
        System.out.println("Enter the array");
        for(int i =0;i<n1;i++) {
            a[i] = s.nextInt();
        }
        int sum1 = sumofsequence(n1);
        int sum2 = sumofarray(a);
        int num = sum2-sum1;
        System.out.println("Missing number is " + num);

	}

public static int sumofarray(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		return sum;
	}

public static int sumofsequence(int n) {
	int sum =0;
	sum = (n * (n+1))/2;
	return sum;
}

}
