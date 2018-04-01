import java.util.Arrays;
import java.util.Scanner;

public class Comparestring {
	public static void main(String[] args) 
	{
		System.out.println("enter the string");
		Scanner scan=new Scanner(System.in);
		String str1=scan.next();
		
		System.out.println("enter size of substring");
		int size=scan.nextInt();
		
		String[] sub=new String[str1.length()-size+1];
		
	//	char[] str2=str1.toCharArray();
		for(int i=0;i<str1.length();i++)
		{
		
			sub[i]= str1.substring(i, i+size);
			if(i==str1.length()-size)
			{
				break;
			}
		}
		for(int i=0;i<sub.length;i++)
		{
			System.out.println(sub[i]);

		}
		String small= sub[0];
		String large=sub[0];
		for(int i=0;i<sub.length;i++)
		{
			String curr=sub[i];
			for(int j=i+1;j<sub.length;j++)
			{
				if(small.compareToIgnoreCase((sub[j]))>0)
				{
					small=sub[j];
				}
				if (large.compareToIgnoreCase(sub[j]) < 0) 
				{
	                large=sub[j];

			}
		}
		
	} 
		System.out.println("------------------------------------------------");
		System.out.println(small);
        System.out.println(large);
		System.out.println("------------------------------------------------");

		
		String[] sub1=new String[str1.length()-size+1];

		Arrays.sort(sub);
		System.out.println(	Arrays.toString(sub));
		System.out.println(sub[0]);
        System.out.println(sub[sub.length-1]);
	}
}
