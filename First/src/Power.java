import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		System.out.println("enter");
	     Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++)
	        {
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int sum=0;
	        sum=sum+(a+1*b);
	        System.out.print(sum+" ");
	       // sum=sum+(2*b);
	        //System.out.print(sum+" ");

	         
	        for(int j=2;j<n;j++)
	        {
	            sum=(int) (sum+((Math.pow(2,j))*b));
	            System.out.print(sum+" ");
	        }
	        System.out.println();
	        }
	        in.close();
	}

}
