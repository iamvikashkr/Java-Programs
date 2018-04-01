import java.util.Scanner;

public class Slanting {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
			System.out.print(" ");	
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}

}
