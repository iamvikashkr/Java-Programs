package hello;

import java.util.Scanner;

public class Cyclic {

	public static void main(String[] args) {
		System.out.println("enter string1");
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		System.out.println("enter string2");
		String str2=scan.nextLine();
		
		//String[] fin=new String[str1.length()];
		
		char a[]=str1.toCharArray();
		char b[]=str2.toCharArray();
		char c[]=new char[str1.length()];
		int lena=a.length;
		int lenb=b.length;
		int j=0;
	
		for( j=0;j<lena;j++)
		{
		int count=0,k=0;
		 while(j<lena)
		 {		

			  //System.out.print(a[(j+1)%lena]);
			   c[k]=a[(j+1)%lena];
			   k++;
			   String str3=new String(c);
			   if(str2.equals(str3))
			   {
				   System.out.println(" Strings are cyclic");
				   System.exit(0);
			   }
			  j=(j+1)%lena;
			  count++;
			  if(count==lena)
			  {
				   //System.out.println("");
				  break;
			  }
		 }
		 
	   }
		System.out.println("not cyclic");
	}

}
