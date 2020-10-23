/**
 * Desc:A java program that can accept an array of String objects and sort in 
 * alphabetical order. The elements in the left half should be completely in 
 * uppercase and the elements in the right half should be completely in lower case.
 *  Return the resulting array
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.*;
public class AlphabeticOrderSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int i;
		//String sortedArray[]=new String[size];
		String arr[]=new String[size];
		System.out.println("Enter the elements of the array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.next();
		}
		String []sortedArray=sortStrings(arr,size);
		System.out.println("Sorted array is:");
		for(i=0;i<size;i++) {
		System.out.print(sortedArray[i]);
		}
	}

	private static String[] sortStrings(String[] arr, int size) {
		// TODO Auto-generated method stub
		String sortedArray[]=new String[size];
		Arrays.sort(arr);
		int i,n1;
		if(size%2!=0)
		{
			 n1=(size/2)+1;
		}
		else {
			n1=(size/2);
		}
		for(i=0;i<n1;i++) 
		{
			sortedArray[i]=arr[i].toUpperCase();
		}
		for(i=n1;i<size;i++)
		{
			sortedArray[i]=arr[i].toLowerCase();
		}
		return sortedArray;
	}

}
