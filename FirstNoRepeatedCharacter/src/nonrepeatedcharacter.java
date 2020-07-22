import java.util.*;

public class nonrepeatedcharacter {

	public static void main(String[] args) {
		System.out.println("enter the sentence");
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char c  = firstnotrepeatedcharacter(input);
        System.out.println("First non repated character " + c);
	}

	public static Character firstnotrepeatedcharacter(String input) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> ch = new HashMap<Character, Integer>();
		int i, len;
		Character c;
		len =input.length();
		
	
		for(i = 0 ; i < len; i++)
		{
		c= input.charAt(i);
		if(ch.containsKey(c))
		{
			ch.put(c, ch.get(c)+1);
		}
		else {
			ch.put(c, 1);
		}
	for(int j = 0 ; j < len ; j++)
	{
		c = input.charAt(j);
		if(ch.get(c)==1)
		{
			return c;
		}
	}
	
		}
		return null;	
	}

}
