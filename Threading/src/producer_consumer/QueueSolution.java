package producer_consumer;

public class QueueSolution {
	int x;
	boolean valueinx=false;
	synchronized public void put(int j)
	{
		try {
			if(valueinx==true)
			{
				wait();
			}
			x=j;
			System.out.println("i have put "+j+" in x");
			valueinx=true;
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}
	synchronized public  void get()
	{
		try {
			if(valueinx==false)
			{
				wait();
			}
			System.out.println("i have got "+x+" from x");
			valueinx=false;
			notify();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}

}
