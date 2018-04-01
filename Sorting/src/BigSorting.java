import java.util.Scanner;

public class BigSorting {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		String arr[]=new String[n];
		System.out.println("enter elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.next();
		}
		long array[]=new long[n];
		for(int i=0;i<n;i++)
		{
			array[i]=Long.parseLong(arr[i]);
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
		for(int i=0;i<n;i++)
		{
			int imin=i;
			int j;
			for( j=i+1;j<n;j++)
			{
				if(array[imin]>array[j])
				{
					imin=j;
				}
			}
			long temp=array[i];
			array[i]=array[imin];
			array[imin]=temp;
			
		}
		System.out.println("sorted array is");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+ " ");
		}
	}

}
