import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ArrayElementCount {
//To Count Occurrences Of Each Element In An Array
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
        arrayElementCount(a);
	}

public static void arrayElementCount(int[] a) {
	HashMap<Integer, Integer> map = new HashMap<>();
	for(int i : a)
	{
		if(map.containsKey(i))
		{
			map.put(i, map.get(i)+1);	
		}
		else {
			map.put(i, 1);		}
	}
	System.out.println("\nInput array is " + Arrays.toString(a));
	System.out.println("Occurences of array is " + map);
}

}
