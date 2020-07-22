import java.util.*;
public class prime {

	public static void main(String[] args) {
		System.out.println("Please enter the number to check whether number is prime or not:");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean flag=false;
		if((n==0) || (n==1))
				{
			System.out.println(n+ " number is not prime");
				}
		else {
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=true;
					break;
				}
				else {
					flag=false;
				}
			}
	}
	if(flag)
	{
		System.out.println(n+ " Number is not prime");
	}
	else{
		System.out.println(n + " Number is  prime");
	}
	}
	

}
