import java.util.Scanner;

public class Concatenation2 {

	public static void main(String[] args) {
		System.out.println("Enter the first string");
		Scanner s =new Scanner(System.in);
		String input1 = s.nextLine();
		System.out.println("Enter the second string");
		Scanner s1 =new Scanner(System.in);
		String input2 = s1.nextLine();
		StringBuffer sb = new StringBuffer();
		sb.append(input1).append(input2);
		System.out.println("Concatenated string is " + sb);
	}

}
