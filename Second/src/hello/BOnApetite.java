package hello;

import java.util.Scanner;

public class BOnApetite {

	public static void main(String[] args) {
		System.out.println("enter number of foods ordered");
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println("index of food not eaten");
        int k = in.nextInt();
        int[] ar = new int[n];
        System.out.println("enter cost");
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        System.out.println("amount charged");
        int b = in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
        	if(i==k)
        	{
        		continue;
        	}
        	else
        	{
        		sum=sum+ar[i];
        	}
        }
        System.out.println("total  "+sum);
        int actual=sum/2;
        System.out.println("actual share is "+ actual);
        if(b>actual) 
        {
        	System.out.println(b-actual);
        }
        else 
        {
        	System.out.println("BOn apetite");
        }

	}
	}


