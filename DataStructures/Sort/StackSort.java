/* Java program to implement basic stack
   operations */
class StackSort
{
   // static final int MAX = 1000;
    int top;
    int a[] ; // Maximum size of Stack
    int size;
   
 
     boolean isEmpty()
    {
        return (top < 0);
    }
    StackSort(int size)
    {
        top = -1;
        this.size=size;
        a=new int[size];
    }
 
    boolean push(int x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }
    
    public int peek() {
		return a[top];
	}
	public void search(int i) {
		int c=0;
		for(int j=0;j<size;j++) {
			if(a[j]==i)
				c++;
		}
		if(c>0)
			System.out.println(i+" is present");
		else
			System.out.println(i+" is not present");
	}
}
 
