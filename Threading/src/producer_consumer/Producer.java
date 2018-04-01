package producer_consumer;

public class Producer extends Thread {
QueueSolution a;
public Producer(QueueSolution q)
{
	a=q;
}
public void run()
{
	int i=1;
	while(true)
	{
		a.put(i++);
	}
}
}
