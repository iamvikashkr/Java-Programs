import java.util.Scanner;

public class Postoffice {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String s1[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			String str=scan.next();
			char first=str.charAt(0);
		if(first=='C')
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
			
		}
	}
	}
}
