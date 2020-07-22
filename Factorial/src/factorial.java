import java.util.*;
public class factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		int i=1,fact=1;
        while(i<=input)
        {
        	fact= fact*i;
        	i++;
        }
        System.out.println("Factorial of " + input + " is " + fact);
	}

}
