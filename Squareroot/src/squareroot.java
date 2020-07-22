import java.util.*;
public class squareroot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int number  = s.nextInt();
		double sqroot = squarerootfunc(number);
		System.out.println("Square root of number " + number + " is " + sqroot);

	}

	public static double squarerootfunc(int number) {
		double temp, sr;
		sr=number/2;
		do {
			temp=sr;
			sr = (temp+(number/temp))/2;
		}while((temp-sr)!=0);
		return sr;
	}

}
