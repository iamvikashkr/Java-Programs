package hello;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		System.out.println("enter something");
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();            
        String ans="";
        if(n%2==1){
          ans = "Weird";
        }
        else
        	if(n%2==0 && n>=2 && n<=5)
        {
            ans = "Not Weird";
        }
        else if(n%2==0 && n>=6 && n<=20)
        {
            ans = "Weird";
        }
        else if(n%2==0 && n>20 && n<=100)
        {
            ans = "Not Weird";
        }
        System.out.println(ans);
        
    }
	}

