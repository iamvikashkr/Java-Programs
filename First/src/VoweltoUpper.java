import java.util.Scanner;

public class VoweltoUpper {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')
			{
				ch[i]=Character.toUpperCase(ch[i]);
				System.out.print(ch[i]);
			}
			else
			{
			System.out.print(ch[i]);
			}
		}
		System.out.println();
String s=new String(ch);
System.out.println(s);
	}

}
