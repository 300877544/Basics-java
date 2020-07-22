import java.util.*;
public class RemoveDuplicateElements {
//Removing Duplicate Elements From ArrayList Using HashSet
	public static void main(String[] args) {
		ArrayList<String> listwithduplicate = new ArrayList<String>();
		listwithduplicate.add("Java");
		listwithduplicate.add("Bini");
		listwithduplicate.add("Babu");
		listwithduplicate.add("Java");
		listwithduplicate.add("JSP");
		listwithduplicate.add("Servlet");
        System.out.print("ArrayList with duplicate elements ");
        System.out.println(listwithduplicate);
        HashSet<String> set = new HashSet<String>(listwithduplicate);
        ArrayList<String> listwithoutduplicate = new ArrayList<String>(set);
        System.out.print("ArrayList without duplicate elements ");
        System.out.println(listwithoutduplicate);
	}

}
