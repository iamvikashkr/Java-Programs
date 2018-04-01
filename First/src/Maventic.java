import java.util.Arrays;
import java.util.Scanner;

public class Maventic {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] str1=str.split(" ");
		char[] ch=str.toCharArray();
		int count=0;
		int value[] = new int[20];
		int k=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' '  || i==ch.length-1)
			{
				value[k]=count;
				k++;
				count=0;
			}
			else
			{
				count++;
				if(i+1==ch.length-1)
				{
					count++;
				}
			}
		}
	/*Arrays.sort(value);

		for(int i=0;i<value.length;i++)
		{
			//System.out.print(value[i]+" ");
		}
		System.out.println();
		int temp[]=new int[7];
		int j=0;
		for(int i=0;i<temp.length-1;i++)
		{
			if(value[i]!=value[i+1])
			{
				temp[j]=value[i];
				j++;
			}
			
		}
		temp[j]=value[temp.length-1];
		for(int i=0;i<temp.length;i++)
		{
			//System.out.print(temp[i]+" ");
		}
		System.out.println();*/
		for(int i=0;i<str1.length;i++)
		{
			
			/*String kuch=str1[i];
			int m = i - 1;
	        while (m >= 0 && kuch.length() < str1[m].length())
	        {
	            str1[m+1] = str1[m];
	            m--;
	        }
	        str1[m+1] = kuch;*/
			
			for(int m=1;m<str1.length;m++)
			{
				if(str1[m].length()<str1[m-1].length())
				{
					String kuch=str1[m-1];
					str1[m-1]=str1[m];
					str1[m]=kuch;
				}
			}
			
		}
		for(int i=0;i<str1.length-1;i++)
		{
			System.out.print(str1[i]+" ");
			if(str1[i].length()==str1[i+1].length())
			{
				continue;
			}
			else
			{
				System.out.print(str1[i].length()+" ");
			}
			if(i+1==str1.length-1)
			{
				System.out.print(str1[i+1]+" "+ str1[i+1].length());
			}
			
			
		}
	}

}
