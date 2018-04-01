import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		System.out.println("enter size");
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key to be searched");
		int key=scan.nextInt();
		int low=0,high=n-1,mid;
		
		while(low<=high)
		{
			mid=(low+high)/2;
			
			if(arr[mid]==key)
			{
				System.out.println("element found :"+ arr[mid]+" position is "+mid );
				System.exit(0);;
			}
			else if(arr[mid]<key)
			{
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		System.out.println("element not found!!! sorry");
		
	}

}
