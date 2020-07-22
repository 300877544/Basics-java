package reverseanumber;

import java.util.Scanner;

public class reversenumber {
    
	public static void main(String[] args) {
		 System.out.println("Enter the number");
		 Scanner s = new Scanner(System.in);
	     int input = s.nextInt();
	     int reverse_number = reverse(input);
	     System.out.println("The reversed number is " + reverse_number);
	}

	public static int reverse(int input) {
		int r=0;
		while(input>0)
		{
			r=r*10;
			r = r + input%10;
			input=input/10;
		}
		return r;
	}

}
