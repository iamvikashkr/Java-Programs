import java.util.Scanner;

public class Anagram1 {

	public static void main(String[] args) {
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
		char c2[]=s2.toCharArray();
		
		int[] count1=new int[s1.length()];
		int[] count2=new int[s1.length()];
		
		int k=0;
		for(char i='a';i<='z';i++)
		{		int count=0;

			for(int j=0;j<c1.length;)
			{
				
				if( i==c1[j])
				{
					count++;
					j++;
				}
				else 
				{
					j++;
				}
				
				
			
				
			}
			//System.out.println(count);
			if(count>0)
			{
			count1[k]=count;
			k++;
			}
			
		}
		for(int i=0;i<k;i++)
		{
		System.out.print(count1[i]+" ");
	}
		System.out.println("");
		
		 k=0;
		for(char i='a';i<='z';i++)
		{		int count=0;

			for(int j=0;j<c1.length;)
			{
				
				if( i==c2[j])
				{
					count++;
					j++;
				}
				else 
				{
					j++;
				}
				
				
			
				
			}
			//System.out.println(count);
			if(count>0)
			{
			count2[k]=count;
			k++;
			}
			
		}
		for(int i=0;i<k;i++)
		{
		System.out.print(count2[i]+" ");
	}
  System.out.println("");
		
		for(int i=0;i<k;i++)
		{
			if(count1[i]==count2[i])
			{
				flag=0;
			}
			else
			{
				flag=1; break;
			}
		}
		
		if(flag==0)
		{
			System.out.println("amagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}
}