import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {

	//	System.out.println("enter no of strings");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the strings");
		String str=scan.nextLine();
		
		String words[]=str.split(" ");
		
		/* for (String word : words) {
	            System.out.println(word);
	        }*/
		 
		 for(int i=0;i<words.length;i++)
		 {
			 System.out.println(words[i]);
		 }
		 System.out.print(words[0]);
		 for(int i=1;i<words.length;)
		 {
			 for(int j=i-1;j>=0;j--)
			 {
				if(words[i].equals(words[j]))
				{
				//System.out.println(" ok");
				i++;
				if(i==words.length)
				{
					break;
				}
				}
				else
				{
					System.out.print(" "+words[i]);
					i++;
				}
			 }

		 }
		
	}

}
