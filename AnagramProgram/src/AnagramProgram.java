import java.util.*;

public class AnagramProgram {

	public static void main(String[] args) {
		System.out.println("Enter the first string");
		Scanner s = new Scanner(System.in);
        String input1 = s.nextLine();
        System.out.println("Enter the second string");
        String input2 = s.nextLine();
        isAnagram(input1, input2);
	}

	public static void isAnagram(String input1, String input2) {
		String removespace1 = input1.replaceAll("\s", "");
		String removespace2 = input2.replaceAll("\s", "");
		boolean status=true;
		if(removespace1.length() != removespace2.length())
		{
			status=false;
		}
		else {
			char[] s1arr = removespace1.toLowerCase().toCharArray();
			char[] s2arr = removespace2.toLowerCase().toCharArray();
			
			Arrays.sort(s1arr);
			Arrays.sort(s2arr);
			status=Arrays.equals(s1arr, s2arr);
		}
		if(status)
		{
			System.out.println(input1 + " and " + input2 + " are anagram");
		}
		else {
			System.out.println(input1 + " and " + input2 + " are not anagram");
		}
		
	}

}
