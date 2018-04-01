package hello;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("enter number of elements");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int[] arr=new int[n];
		System.out.println("enter the elements");

		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=scan.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int oddind=1;
		int evenind=0;
		while(true)
		{
			while(evenind<n && arr[evenind]%2==0)
			{
				evenind=evenind+2;
			}
			while(oddind<n && arr[oddind]%2==1) 
			{
			oddind=oddind+2;	
			}
			if(evenind<n && oddind<n)
			{
				int temp;
				temp= arr[evenind];
				arr[evenind]=arr[oddind];
				arr[oddind]=temp;
				evenind+=2;
				oddind+=2;
			}
			else 
			{
				break;
			}
		}
		System.out.println("sorted array iss");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
