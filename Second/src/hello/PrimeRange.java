package hello;

import java.util.Scanner;

public class PrimeRange {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter range");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int palin;
		Palindrome p=new Palindrome();
		int count=0;int count2=0;
		for(int i=n1;i<=n2;i++)
		{
			int flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				count++;
			System.out.println(i+" is a prime no");
			palin=p.palindrom( i);
			if(palin==i)
			{
				count2++;
				System.out.println(i + " is a palindrome and prime");
			}
			
			
			
			}
		}
		System.out.println("Number of prime number between this range "+ count);
			System.out.println("number of palindrome no "+count2);	
		
	}

}
