import java.util.*;

public class CountWords {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      String in =  s.nextLine();
      int word = wordcount(in);
      System.out.println("Word count of the string " + in+ " is " + word);
	}

	private static int wordcount(String in) {
		char[] ch = new char[in.length()];
		int c=0;
		for(int i =0 ;i < in.length();i++)
		{
			ch[i] = in.charAt(i);
			if(((ch[i]!=' ') && (i>0) && (ch[i-1]==' ')) || ((i==0)&&(ch[0]!=' '))) {
				c++;
			}
		
		}
		return c;
	}

}
