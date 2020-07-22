import java.util.*;
import java.io.*;
public class InsertionSort {

	public static void main(String[] args) throws IOException {
		String list="";
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Please enter the list of elements,one element per line");
        System.out.println(" write 'STOP' when list is completed ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        elementlist=insertionsort(elementlist);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Values after Insertion Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
	}

	public static int[] insertionsort(int[] elementlist) {
		for(int i=1;i<elementlist.length;i++)
		{
			int key = elementlist[i];
			int j=i-1;
			while((j>=0) && (elementlist[j] > key))
			{
				int temp;
				temp=elementlist[j];
				elementlist[j]=elementlist[j+1];
				elementlist[j+1]=temp;
				j--;
			}
		
	}
		return elementlist;

	}

}
