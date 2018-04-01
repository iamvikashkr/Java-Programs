import java.util.Scanner;

public class Insertionsort {

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
		
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}
	

}
