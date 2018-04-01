import java.util.Scanner;

public class AbcDrive1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		int i=scan.nextInt();
		int j=scan.nextInt();
		String kit=scan.next();
		
		String ex[][]=new String[i][j];
		int len1=ex.length;
		int len2=ex[j].length;
		System.out.println(len1+" "+len2);
		for(int a=0;a<=ex.length-1;a++)
		{
			for(int b=0;b<=ex[j].length-1;b++)
			{
				ex[a][b]=scan.next();
			}

		}
		for(int a=0;a<i;a++)
		{
			for(int b=0;b<j;b++)
			{
				System.out.println(ex[a][b]);
			}

		}
		int count=0;
		for(int a=0;a<=ex.length-1;a++)
		{
			for(int b=0;b<=ex[j].length-1;b++)
			{
				System.out.println("dvvs");
				if(ex[a][b]==kit)
				{
					
					System.out.println(ex[a][b]);
				}
			}

		}
		
	}

}
