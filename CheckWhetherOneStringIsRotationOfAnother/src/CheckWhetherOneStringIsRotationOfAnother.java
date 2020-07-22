import java.util.Scanner;

public class CheckWhetherOneStringIsRotationOfAnother {
//Write a java program to check whether one string is a rotation of another. For example, If 
	//“JavaJ2eeStrutsHibernate” is a string then some rotated 
	//versions of this string are “StrutsHibernateJavaJ2ee”, “J2eeStrutsHibernateJava“, 
	//“HibernateJavaJ2eeStruts“
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the first string:");
		String s1 = sc.nextLine();
		System.out.println("Please enter the second string:");
		String s2 = sc.nextLine();
        String s3="";
        if(s1.length() != s2.length())
        {
        	System.out.println("s2 is not rotated version of s1");
        }
        else {
        	s3=s1+s1;
        	if(s3.contains(s2)) {
        		System.out.println("s2 is  rotated version of s1");
        	}
        	else {
        		System.out.println("s2 is not rotated version of s1");
        	}
        }
	}

}
