import java.util.Scanner;

public class Split {

	public static void main(String[] args) 
	{
		System.out.println("enter the string");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();
        
         s = s.trim();
        
        if (s.length() == 0) {
            System.out.println(0);
            return;
        }
        String []words;
        words = s.split("[^a-zA-Z]+");
        
        //String [] words = s.split("[^a-zA-Z]");
       // String [] words = s.split("[^a-zA-Z]*");
       // String [] words = s.split("[ ,.!?_'@]+");


        System.out.println(words.length);
        for (String word : words) {
            System.out.println(word);
        }
        
        
        String Str = new String("   Welcome to     Tutorialspoint.com   ");

        System.out.print("Return Value :" );
        System.out.println(Str.trim() );
    }
}

	
