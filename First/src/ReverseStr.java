import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		   System.out.println("gf");
	        Scanner sc=new Scanner(System.in);
	        String A=sc.nextLine();
	        char c[]=A.toCharArray();
	        
	        for(int i=0;i<A.length();i++)
	        {
	        	System.out.print(c[i]);
	        }
	        System.out.println();
	        char B[]=new char[A.length()];
	        int j=0;
	        for(int i=A.length()-1;i>=0;i--)
	        {
	            B[j]=c[i];
	            j++;
	        }
	        for(int i=0;i<B.length;i++)
	        {
	        System.out.print(B[i]);
	        }
	        System.out.println();
	        
	      String d=new String(B);
	      
	      if(d.equals(A))
	        {
	        	System.out.println("yes");
	        }
	        else
	        {
	        	System.out.println("np");
	        }
	}

}
