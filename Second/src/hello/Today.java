package hello;

import java.util.Scanner;

public class Today {
	private static Scanner scan;
	public static void main(String[] args) {
		Prime p1=new Prime();
        Palindrome p2=new Palindrome();
		int i,n,res,palin;
		System.out.println("enter the number");
		scan = new Scanner(System.in);
		n=scan.nextInt();
		System.out.println("entered number is " + n);
		for(i=n;;i++)
		{
			res=p1.prim(i);
			if(res==0)
			{
				//System.out.println(i+"is a prime number");
				palin=p2.palindrom(i);
				if(palin==i)
				{
					System.out.println(i + " is a palindrome and prime");
					break;
				}
			}
			
		}
		
	}

}
