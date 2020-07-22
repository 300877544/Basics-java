import java.util.*;
public class Reversestring {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println("Input string " +input);
        reverse(input);
        
	}

	public static void reverse(String input) {
	String rev="";
		for(int i = input.length()-1;i>=0;i--)
		{
			rev = rev+ input.charAt(i);
		}
		System.out.println("Reversed string " +rev);
	}

}
