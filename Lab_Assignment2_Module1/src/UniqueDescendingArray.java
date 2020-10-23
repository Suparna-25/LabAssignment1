/** Desc:A java program which accepts an integer array and removes all the duplicates in the array. 
 * Return the resulting array in descending order
 * @author Suparna Arya
 * Date:23/11/2020
 *
 */
import java.util.Scanner;
public class UniqueDescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int i,j,temp;
		int arr[]=new int[size];
		System.out.println("Enter the elements of the array");
		for(i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
	    int n=modifyArray(arr,size);
	    System.out.println("Duplicate removed descending order sorted array is");
	    for(i=0;i<n;i++) {
			for(j=0;j<n-1-i;j++) {
				if(arr[j]<arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}		
			}
		}
	    for(i=0;i<n;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
	}

	private static int modifyArray(int[] arr, int size) {
		// TODO Auto-generated method stub
		int a[]=new int[size];
		int i,j=0,temp;
		if(size==0 || size==1){
			return size;
			}
		 for (i=0; i<size-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                a[j++] = arr[i];  
	            }  
	         }  
             a[j++] = arr[size-1];     
	        // Changing original array  
	        for (i=0; i<j; i++){  
	            arr[i] = a[i];
	        }		
		return j;
	        }
				
}
