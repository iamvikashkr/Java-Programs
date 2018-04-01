package hello;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int gcd=0;
		for(int i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				 gcd=i;
				 System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.println(gcd);
	}

}
