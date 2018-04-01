package hello;

import java.util.Scanner;

public class Prefix {

	public static void main(String[] args) {
		System.out.println("enter number of strings");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s[]=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=scan.next();
		}
		//System.out.println(s[0]);
		//System.out.println(s[1]);
		
		int count=0;
		
		char a[]=s[0].toCharArray();
		char b[]=s[1].toCharArray();
		
		 for(int i=0;i<a.length && i<b.length;i++)
		 {
			 if(a[i]==b[i])
			 {
				count++; 
			 }
		}
		 int fin=0;
		 if(n<=2)
		 {
		 System.out.println(count);
		 System.exit(0);
		 }
		 for(int i=2;i<n;i++)
		 {
			 int count1=0;

			 char c[]=s[i].toCharArray();
			for(int j=0;j<count && j<a.length && j<c.length;j++)
			{
				if(a[j]==c[j])
				{
					count1++;
				}
			 }	
			
			//System.out.println(count1);
			fin=count1;
		 }
		 System.out.println(fin);
		 for(int i=0;i<fin;i++) 
		 {
			 System.out.print(a[i]);
		 }
	}

}
