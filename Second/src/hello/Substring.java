package hello;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		
		System.out.println("enter the substring to be replaced");
		String s2=scan.next();
		
		System.out.println("enter a sub string");
		String s3=scan.next();
		
		char first[]=s1.toCharArray();
		char subs1[]=s2.toCharArray();
		char subs2[]=s3.toCharArray();
		
		int a=first.length;
		int b=subs1.length;
		int k=0,j=0;
		for(int i=0;i<a;i++)
		{
			
			if(first[i]==subs1[k])
			{
				first[i]=subs2[j];
				k++;
				j++;
				
						
			}
			if(k>subs2.length)
			{
				break;
			}
		}
		
		for(int i=0;i<a;i++)
		{
		System.out.print(first[i]);
		}
		

	}

}
