import java.util.*;
import java.io.*;
public class SelectionSort {

	public static void main(String[] args) throws IOException {
		String list="";
		ArrayList<Integer> arrlist = new ArrayList<>();
		System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter the list of elements,one element per line");
        System.out.println(" write 'STOP' when list is completed ");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop"))
        {
        	int intelement = Integer.parseInt(list);
        	arrlist.add(intelement);
        }
        
        int elementlist[] = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for(int j=0;iter.hasNext();j++)
        {
        	elementlist[j] = iter.next();
        }
        elementlist=selectionSort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Selection Sort : ");
        for(int k=0;k<elementlist.length;k++)
        {
        	System.out.println(elementlist[k] + " ");
        }
	}

	public static int[] selectionSort(int[] elementlist) {
		for(int i =0 ;i<elementlist.length-1;i++) {
			int minpos;
			minpos=i;
			for(int j=i+1;j<elementlist.length;j++)
			{
				if(elementlist[j]<elementlist[minpos])
				{
					minpos=j;
				}
			}
			swap(elementlist, minpos,i);		}
		return elementlist;
	}

	public static void swap(int[] elementlist, int minpos, int i) {
	 int temp;
	 temp=elementlist[minpos];
	 elementlist[minpos]=elementlist[i];
	 elementlist[i]=temp;
		
	}

}
