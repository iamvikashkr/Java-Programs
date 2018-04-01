package hello;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int nw;
		for(int i=2;i<=num/2;i++)
		{
			nw=num;
			while(nw%i==0)
			{
				int isprime=1;
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						isprime=0;
						break;
					}
				}
				if(isprime==1)
				{
					System.out.print(i+" ");
				}
				
				nw=nw/i;

			
			}
		}
	}

}
