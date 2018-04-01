package producer_consumer;

public class Queue {
	int x;
	public void put(int j)
	{
		x=j;
		System.out.println("i have put "+j+" in x");
	}
	public void get()
	{
		System.out.println("i have got "+x+" from x");
	}

}
