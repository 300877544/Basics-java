import java.util.*;
public class SortArrayList {

	public static void main(String[] args) {
		ArrayList<String> arrlist = new ArrayList<String>();
		arrlist.add("USA");
		arrlist.add("India");
		arrlist.add("Canada");
		arrlist.add("Saudi Arabia");
		arrlist.add("Belgium");
		arrlist.add("Nepal");
        System.out.println("Arraylist before sorting");
        for(String val:arrlist)
        {
        	System.out.println(val);
        }
        Collections.sort(arrlist);
        System.out.println("Arraylist after sorting");
        for(String val:arrlist)
        {
        	System.out.println(val);
        }
	}

}
