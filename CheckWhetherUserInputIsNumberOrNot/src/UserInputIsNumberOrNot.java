import java.util.*;

public class UserInputIsNumberOrNot {

	public static void main(String[] args) {
		System.out.println("Enter the  number");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        boolean number = numberOrNot(input);
        if(number)
        {
    		System.out.println("Entered is a number");
        }
        else {
        	System.out.println("Entered is not a number");
        }
	}

	public static boolean numberOrNot(String input) {
		try {
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex) {
			return false;
		}
		return true;
	}

}
