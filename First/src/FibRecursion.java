import java.util.Scanner;

public class FibRecursion {
	static int fib(int n)
	{
		if(n<=1)
		{
			return n;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}

	public static void main(String[] args) {

		System.out.println("enter the no");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.println(fib(n));
	}

}
