import java.util.Scanner;

public class Savetheprisoner {

	public static void main(String[] args) {

		System.out.println("kjjh");
		        Scanner scan = new Scanner(System.in);
		       int T=scan.nextInt();
		             while (T-- > 0) {
		                 int N = scan.nextInt();
		                 int M = scan.nextInt();
		                 int S = scan.nextInt();
		                 int last=0;
		                 for(int i=S-1,j=0;j<M;i++) 
		                 {
		                	 last=((N+(i))%N) ;
		                	j++;
		                	 
		                 
		                 }
		                 last=last+1;
		                System.out.println(last); 
		         }
		     }
}
	

