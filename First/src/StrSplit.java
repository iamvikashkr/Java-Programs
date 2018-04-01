import java.util.Scanner;

public class StrSplit {

	public static void main(String[] args) {

		System.out.println("enter string");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		String[] split=str.split(" ");
		
		for( String word: split)
		{
			System.out.print(word);
		}
		System.out.println();
		String fin[]=new String[split.length];
		for(int i=0;i<split.length;i++)
		{
			String rev = "";
			
			for(int j=split[i].length()-1;j>=0;j--)
			{
				rev=rev+split[i].charAt(j);
				
				
			}
			
			System.out.print(rev+ " ");
			
				fin[i]=rev;
			
		}
		System.out.println();
		for(int k=fin.length-1;k>=0;k--)
		{
			System.out.print(fin[k]+" ");
		}
		
	}

}
