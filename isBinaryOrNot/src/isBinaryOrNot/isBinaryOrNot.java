package isBinaryOrNot;

import java.util.Scanner;

public class isBinaryOrNot {
//To Check Whether The Given Number Is Binary Or Not :
	public static void main(String[] args) {
		 System.out.println("Enter the number");
		 Scanner s = new Scanner(System.in);
	     int input = s.nextInt();
	     isBinaryorNot(input);
	}

public static void isBinaryorNot(int input) {
	boolean isBinary = true;
	int copynumber = input;
	while(copynumber!=0)
	{
		int temp = copynumber %10;
		if(temp>1)
		{
			isBinary=false;
			break;
		}
		else {
			copynumber=copynumber/10;
		}
		
		
	}
	if(isBinary)
	{
		System.out.println( input + " is a binary number");
	}
	else {
		System.out.println( input + " not a binary number");
	}
}

}
