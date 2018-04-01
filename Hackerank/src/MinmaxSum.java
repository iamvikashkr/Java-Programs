import java.util.Arrays;
import java.util.Scanner;

public class MinmaxSum {

	public static void main(String[] args) {

		System.out.println("enter size of arary");
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		long sum1=0;
		long sum2=0;
		for(int i=0;i<5;i++)
		{
			if(i==0)
			{
				continue;
			}
			sum1+=arr[i];
		}
		for(int i=0;i<5;i++)
		{
			if(i==4)
			{
				continue;
			}
			sum2+=arr[i];
		}
		System.out.println(sum2+" "+sum1);
	}

}
