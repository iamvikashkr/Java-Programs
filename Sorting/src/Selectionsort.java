
import java.util.Scanner;

public class Selectionsort {

	public static void main(String[] args) {

		System.out.println("enter the size of array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int arr[]=new int[n];
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		 
		for(int i=0;i<n;i++)
		{
			int imin=i;
			int j;
			for( j=i+1;j<n;j++)
			{
				if(arr[imin]>arr[j])
				{
					imin=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[imin];
			arr[imin]=temp;
			
		}
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}

}
