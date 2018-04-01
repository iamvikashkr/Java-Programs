import java.util.Scanner;

public class Queue {
	static Scanner scan=new Scanner(System.in);
	static int r=-1;
	static int f=0;
	static void insert(int q[], int size)
	{
		int ele;
		if(r==size-1)
		{
			System.out.println("Queue is full already!!!");
		}
		else
		{
			System.out.println("Enter the element");
			ele=scan.nextInt();
			++r;
			q[r]=ele;
			
		}
	}
	
	static void delete(int q[], int size)
	{
		if(r==-1 || f>r)
		{
			System.out.println("Deletion not possible");
			
		}
		else
		{
			System.out.println("Item deleted is "+ q[f]);
			++f;
			
		}
	}
	static  void display(int q[], int size)
	{
		if(r==-1 || f>r)
		{
			System.out.println("Queue is empty");
			
		}
		else
		{
			for(int i=f;i<=r;i++)
			{
				System.out.print(q[i]+"  ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("enter the size of queue");
		int size=scan.nextInt();
		int q[]=new int[size];
		int choice;
		while(true)
		{
			System.out.println("1. insert");
			System.out.println("2. delete");
			System.out.println("3. disp");
			System.out.println("4. stop");
			choice=scan.nextInt();
			switch(choice)
			{
			case 1: insert(q, size);
			break;
			case 2: delete(q,size);
			break;
			case 3: display(q,size);
			break;
			case 4: System.exit(0);		
			}
		}
	}

}
