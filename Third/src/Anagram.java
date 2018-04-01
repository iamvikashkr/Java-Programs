import java.util.*;
public class Anagram {

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int flag=1;
		System.out.println("enter the first string");
		String s1=scan.nextLine();
		s1=s1.toLowerCase();
		System.out.println("enter the second string");
		String s2=scan.nextLine();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("not a amagram");
			System.exit(0);
		}
		char c1[]=s1.toCharArray();
		Arrays.sort(c1);
		char c2[]=s2.toCharArray();
		Arrays.sort(c2);
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]==c2[i])
			{
				flag=0;
			}
			else
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}
	}

}
