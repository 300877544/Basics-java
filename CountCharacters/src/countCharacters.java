import java.util.Scanner;

public class countCharacters {

	public static void main(String[] args) {
		System.out.println("Enter the sentence");
		Scanner s = new Scanner(System.in);
	      String in =  s.nextLine();
	      int word = charactercount(in);
	      System.out.println("Word count of the string " + in+ " is " + word);

	}

	public static int charactercount(String in) {
		int c=0, i;
		for(i =0 ; i< in.length();i++)
		{
			char ch = in.charAt(i);
			if(ch!=' ')
			{
			  c++;	
			}
		}
		
		return c;
	}

}
