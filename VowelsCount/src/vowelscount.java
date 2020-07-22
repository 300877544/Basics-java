import java.util.Scanner;

public class vowelscount {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int vowelcount = vowelscounter(input);
        System.out.println("Vowelscount " + vowelcount);
	}

	public static int vowelscounter(String input) {
		int i, c=0;
		for(i =0 ; i < input.length();i++)
		{
			char ch = input.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				c++;
			}
		}
		return c;
	}

}
