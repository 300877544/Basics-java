import java.util.*;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		 System.out.println("Enter the input String");
		Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        char[] ch = input.toCharArray();
        String stringwithoutspace="";
        for(int i =0 ; i< ch.length;i++)
        {
        	if((ch[i] != ' ') && (ch[i] != '\t')) {
        		stringwithoutspace = stringwithoutspace + ch[i];
        	}
        }
        System.out.println("Input String : "+input);
        
        System.out.println("Input String Without Spaces : "+stringwithoutspace);
	}

}
