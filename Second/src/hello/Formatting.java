package hello;

import java.util.Scanner;

public class Formatting {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        System.out.println("================================");
	        for(int i=0;i<3;i++)
	        {
	            String s1=sc.next();
	            int x=sc.nextInt();
	            int len=s1.length();
	            System.out.print(s1);
	            for(int j=len;j<16;j++)
	            {
	            	System.out.print(" ");
	            }
	            if(x<1)
	            {
	            	System.out.print("000");
	            	System.out.println();
	            }
	            if(x<10 &&x>=1)
	            {
	            	System.out.print("00"+x);
	            	System.out.println();
	            }
	            if(x<100 &&x>=10)
	            {
	            	System.out.print("0"+x);
	            	System.out.println();
	            }
	            if(x>=100)
	            {
	            	System.out.print(x);
	            	System.out.println();
	            }
	        }
	        
	        System.out.println("================================");
		}
	}


