/** Desc:A java program which accepts an integer array, 
 * reverse the numbers in the array and returns the resulting array in sorted order
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int i;
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(i=0;i<size;i++)		
		{
			arr[i]=sc.nextInt();
			int rev=getReverseNum(arr[i]);
			arr[i]=rev;
		}
		int[] sortedArray=getSortedArray(arr,size);
		System.out.println("Sorted Array is:");
		for(i=0;i<size;i++)
		{
			System.out.print(sortedArray[i]+" ");
		}
	}

	private static int[] getSortedArray(int[] arr, int size) {
		// TODO Auto-generated method stub
		int i,j,temp;
		for(i=0;i<size;i++)
		{
			for(j=0;j<size-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	private static int getReverseNum(int num) {
		// TODO Auto-generated method stub
		int rev=0;
		while(num>0)
		{
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}
		return rev;
	}

}
