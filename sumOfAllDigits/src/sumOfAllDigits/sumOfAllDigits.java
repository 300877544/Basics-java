package sumOfAllDigits;
import java.util.*;
public class sumOfAllDigits {

	public static void main(String[] args) {
	 System.out.println("Enter the number");
     Scanner s = new Scanner(System.in);
     int input = s.nextInt();
     int sumof = sumofdigit(input);
     System.out.println("The sum of number is " + sumof);
	}

	public static int sumofdigit(int input) {
	    int number = input;
	    int sum=0;
	    while(number>0)
	    {
	    	int lastdigit = number % 10;
	    	sum = sum +  lastdigit;
	    	number =number /10;
	    }
		return sum;
	}

}
