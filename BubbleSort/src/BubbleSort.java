import java.util.*;
import java.io.*;
public class BubbleSort {

	public static void main(String[] args) throws IOException {
		String list="";
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		System.out.println(" ");
	    System.out.println(" ");
	    System.out.println("Please enter the list of elements,one element per line");
	    System.out.println(" write 'STOP' when list is completed ");
	    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   
	    while(!(list=bf.readLine()).equalsIgnoreCase("stop"))
	    {
	    	
	    	int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
	    }
	    int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
	    

	    elementlist=bubbleSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Bubble Sort : ");
        for(int k =0 ; k< elementlist.length;k++)
        {
        	System.out.println(elementlist[k] + " ");
        }
	}

	public static int[] bubbleSort(int[] elementlist) {
		int len = elementlist.length;
		for(int i =0;i<len;i++)
		{
			for(int j =1;j<len-i;j++)
			{
				if(elementlist[j-1]>elementlist[j])
				{
					int temp;
					temp=elementlist[j-1];
					elementlist[j-1]=elementlist[j];
					elementlist[j]=temp;
				}
			}
		}
		return elementlist;
	}

}
