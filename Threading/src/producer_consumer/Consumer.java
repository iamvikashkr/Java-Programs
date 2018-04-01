package producer_consumer;

public class Consumer extends Thread {
QueueSolution b;
public Consumer(QueueSolution q)
{
	b=q;
}
public void run()
{
	while(true)
	{
		b.get();
	}
}
}
