import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter the limit for fiboacci series ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a=0, b=1;
		System.out.println("Fibonaci series are ");
		System.out.println(a+ "\n" + b);
		for(int j=2;j<n;j++)
		{
			int c;
			c=a+b;
			System.out.println(" " + c);
			a=b;
			b=c;
		}
	}

}
