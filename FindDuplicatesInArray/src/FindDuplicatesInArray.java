import java.util.*;
import java.util.Map.Entry;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		System.out.println("Enter the limit of the array");
		Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int a[] = new int[n1];
      
        System.out.println("Enter the array");
        for(int i =0;i<n1;i++) {
            a[i] = s.nextInt();
        }
        findDuplicatesUsingHashMap(a);
	}

	public static void findDuplicatesUsingHashMap(int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int element : a)
		{
			if(map.get(element) == null)
			{
				map.put(element, 1);
			}
			else {
				map.put(element, map.get(element)+1);
			}
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		for(Entry<Integer, Integer> entry : set)
		{
			if(entry.getValue()>1)
			{
				System.out.println("Duplicate element " + entry.getKey() + " found " + entry.getValue()+ " times");
			}
		}
	}

}
