import java.util.*;
public class Armstrongnumber {

	public static void main(String[] args) {
	 System.out.println("Enter the number");
	 Scanner s = new Scanner(System.in);
	 int number = s.nextInt();
	 armstrong(number);
	}

	public static void armstrong(int number) {
		int c=0, temp;
		temp=number;
		while(number>0)
		{
			int a = number%10;
			c= c+ a*a*a;
			number = number/10;
		}
		if(temp==c)
		{
			 System.out.println("Entered number is Armstrong");
		}
		else {
			System.out.println("Entered number is not Armstrong");
		}
		
		
	}

}
