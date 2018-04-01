import java.util.Scanner;

public class Fibonacci {



	public static void main(String[] args) {
		System.out.println("enter the no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] fib=new int[n+1];
		fib[0]=0;
		fib[1]=1;
		if(n==1)
		{
			System.out.println(fib[0]);
			System.exit(0);
			
		}
		
		else
		{
		for(int i=2;i<n;i++)
		{
			fib[i]=fib[i-1]+fib[i-2];
		}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(fib[i]);

		}
		System.out.println("sum: "+ fib[n-1]);

	}

}
