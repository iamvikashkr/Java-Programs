package hello;

public class Palindrome {
	


		int   palindrom(int n)
		{
			int rev=0,rem;
			int num=n;
			while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
			if(n==rev)
			{
				return rev;
			}
			else
			{
				return 0;
			}
		}
	}


