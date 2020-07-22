import java.util.Scanner;

public class Concatenation {

	public static void main(String[] args) {
		System.out.println("Enter the first string");
		Scanner s =new Scanner(System.in);
		String input1 = s.nextLine();
		System.out.println("Enter the second string");
		Scanner s1 =new Scanner(System.in);
		String input2 = s1.nextLine();
		String result = input1.concat(input2);
		System.out.println("Concatenated String is " + result);
	}

}
