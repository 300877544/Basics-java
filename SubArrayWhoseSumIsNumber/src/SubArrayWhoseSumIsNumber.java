import java.util.Arrays;
import java.util.Scanner;

public class SubArrayWhoseSumIsNumber {
	//To Find Continuous Sub Array In Array Whose Sum Is Equal To Number
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
        findSubArray(a, inputnumber);

	}

	public static void findSubArray(int[] inputArray, int inputNumber) {
		
		int sum = inputArray[0];
		 
        //Initializing starting point with 0
 
        int start = 0;
 
        //Iterating through inputArray starting from second element
 
        for (int i = 1; i < inputArray.length; i++)
        {
            //Adding inputArray[i] to the current 'sum'
 
            sum = sum + inputArray[i];
 
            //If sum is greater than inputNumber then following loop is executed until
 
            //sum becomes either smaller than or equal to inputNumber
 
            while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'
 
                sum = sum - inputArray[start];
 
                //Incrementing start by 1
 
                start++;
            }
 
            //If 'sum' is equal to 'inputNumber' then printing the sub array
 
            if(sum == inputNumber)
            {
                System.out.println("Continuous sub array of "+Arrays.toString(inputArray)+" whose sum is "+inputNumber+" is ");
 
                for (int j = start; j <= i; j++)
                {
                    System.out.print(inputArray[j]+" ");
                }
 
                System.out.println();
            }
        }
	}

}
