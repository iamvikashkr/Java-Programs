import java.util.Scanner;
public class Stack {
	static Scanner scan=new Scanner(System.in);

	static int top=-1;
	static void push(int s[],  int size)
	{
		int ele;
		System.out.println(top);
		if(top==size-1)
		{
			System.out.println("stack is full!!!!");
		}
		else
		{
			System.out.println("enter the element to be inserted");
			ele=scan.nextInt();
			++top;
			s[top]=ele;
		}
		System.out.println(top);

	}
	static void pop(int s[],  int size)
	{
		if(top==-1) {
			System.out.println("stack is empty!!");
		}
		else
		{
			System.out.println("element popped is "+ s[top]);
			--top;
		}
	}
	static void disp(int s[],  int size)
	{
		int i;
		if(top==-1)
		{
			System.out.println("stack is empty");
		}
		else
		{
			for( i=top;i>=0;i--)
			{
				System.out.print(s[i]+ " ");
			}
		}
		System.out.println();

	}

	public static void main(String[] args) {



		System.out.println("enter the size of stack");
		int size=scan.nextInt();
		int s[]=new int[size];
		int choice;
		while(true)
		{
			System.out.println("1. push");
			System.out.println("2. pop");
			System.out.println("3. disp");
			System.out.println("4. stop");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1: push(s, size);
			break;
			case 2: pop(s,size);
			break;
			case 3: disp(s,size);
			break;
			case 4: System.exit(0);		
			}
		}

	}
	

}
