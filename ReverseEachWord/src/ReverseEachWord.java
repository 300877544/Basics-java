import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		 Scanner s = new Scanner(System.in);
	     String input = s.nextLine();
	     reverseEachWordOfString(input);

	}

	private static void reverseEachWordOfString(String input) {

        
      
String[] words = input.split(" ");

		String reversestring="";
		for(int i=0;i<words.length;i++)
	{
		String word = words[i];
		String reverseword="";
			for(int j=word.length()-1;j>=0;j--)
		{
			reverseword = reverseword + word.charAt(j);
			}
			reversestring = reversestring + reverseword + " ";
		}
		System.out.println("Input String is " + input);
		System.out.println("Reversed String is " + reversestring);
	}

}
