import java.util.Scanner;

public class Usingch {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		//String[] s1=new String[5];
	// s1[0]=scan.nextLine();
		String s1=scan.nextLine();
	String  s2=	s1.toLowerCase();
	char s=s2.charAt(0);

		//char s=scan.next().charAt(0);
		
		switch(s)
		{
		case 'a': System.out.println("audi");
		break;
		default: System.out.println("no match");
		break;
		}
		
	}

}
