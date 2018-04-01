import java.util.Scanner;

public class Bubblesort {

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
			for(int j=1;j<n-i;j++)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array is");

		for (int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
