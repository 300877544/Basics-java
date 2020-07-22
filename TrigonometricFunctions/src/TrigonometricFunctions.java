import java.util.Scanner;

public class TrigonometricFunctions {

	public static void main(String[] args) {
		System.out.println("Enter the angle");
		 Scanner s = new Scanner(System.in);
	     int input = s.nextInt();
	     Double angle = Double.valueOf(input);
	     Double angleinRadians = Math.toRadians(angle);
	     Double sineofNum = Math.sin(angleinRadians);
	     Double cosofNum = Math.cos(angleinRadians);
	     Double tangentofNum = Math.tan(angleinRadians);
	     Double cosecofNum = 1/sineofNum;
	     Double secofNum = 1/cosofNum;
	     Double cotofNum = 1/tangentofNum;
	     System.out.println("sin("+angle+") = "+sineofNum);
	     System.out.println("cos("+angle+") = "+cosofNum);
	     System.out.println("tan("+angle+") = "+tangentofNum);
	 
	     System.out.println("--------------------------------");
	 
	     System.out.println("sec("+angle+") = "+secofNum);
	     System.out.println("cosec("+angle+") = "+cosecofNum);
	     System.out.println("cot("+angle+") = "+cotofNum);
	}

}
