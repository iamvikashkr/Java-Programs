import java.util.Scanner;

public class CircularQueue {
	static Scanner scan=new Scanner(System.in);
	static int r=-1;
	static int f=0;
	static int count=0;
	static void insert(int q[], int size)
	{
		int ele;
		if(count==size)
		{
			System.out.println("Queue is full already!!!");
		}
		else
		{
			System.out.println("Enter the element");
			ele=scan.nextInt();
			r=(r+1)%size;
			q[r]=ele;
			++count;
		}
	}
	
	static void delete(int q[], int size)
	{
		if(count==0)
		{
			System.out.println("Deletion not possible");
			
		}
		else
		{
			System.out.println("Item deleted is "+ q[f]);
			f=(f+1)%size;
			--count;
			
		}
	}
	static  void display(int q[], int size)
	{
		int f1=f;
		if(count==0)
		{
			System.out.println("Queue is empty");
			
		}
		else
		{
			for(int i=1;i<=count;i++)
			{
				System.out.print(q[f1]+"  ");
				f1=(f1+1)%size;
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
