import java.util.HashMap;
import java.util.Scanner;

public class EachCharCountInString {

	
    public static void main(String[] args)
    {
    	System.out.println("Enter the input String");
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        EachCharCount(input);
    }

	public static void EachCharCount(String input) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = input.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println("Input string is " + input + " Characters are " + map);
	}

}
