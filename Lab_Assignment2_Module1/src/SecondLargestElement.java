/**
 * Desc:A java program which accepts an array of integer elements and return the second smallest element in the array
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.Scanner;
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");	
		int size=sc.nextInt();
			int arr[]=new int[size];
			int i;
		System.out.println("Enter the elements of the array");	
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int secondLar=getSecondSmallest(arr,size);
		System.out.println("Second Largest Array element is:"+secondLar);
	}

		private static int getSecondSmallest(int arr[],int size) {
			// TODO Auto-generated method stub
			int secondLar=0,i=0,j=0,temp=0;
			
			for(i=0;i<size;i++)
			{
				for(j=0;j<size-1-i;j++)
				{
					if(arr[j]<arr[j+1])
					{
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						}
			     }
			
		   }
		 secondLar=arr[1];
		 return secondLar;
		}
}

	
	
	
