import java.util.*;

public class uniquechar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
      	boolean result=false;;
        System.out.println("String is " + input);
        HashSet<Character> h = new HashSet<>();
        for(int i =0 ; i < input.length();i++)
        {
        	
        	result = h.add(input.charAt(i));
        	if(result==false)
        		break;
        }
        System.out.println(result);
	}

}
