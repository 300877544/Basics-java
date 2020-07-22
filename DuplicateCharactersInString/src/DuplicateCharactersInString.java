import java.util.*;

public class DuplicateCharactersInString {

	public static void main(String[] args) {
		 System.out.println("Enter the input String");
			Scanner s = new Scanner(System.in);
	        String input = s.nextLine();
	        duplicateCharCount(input);

	}

	public static void duplicateCharCount(String input) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		char strArray[]  = input.toCharArray();
		for(char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			else {
				charCountMap.put(c, 1);
			}
		}
		Set<Character> charsInString = charCountMap.keySet();
		System.out.println("Duplicate characters in " + input);
		for(Character ch : charsInString)
		{
			if(charCountMap.get(ch)>1)
			{
				System.out.println(ch+ " : " + charCountMap.get(ch));
			}
		}
	}

}
