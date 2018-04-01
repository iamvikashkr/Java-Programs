package producer_consumer;

public class Launch {

	public static void main(String[] args) {
		//Queue q=new Queue();
		QueueSolution q=new QueueSolution();
		Producer p=new Producer(q);
		p.start();
Consumer c=new Consumer(q);
c.start();
	}

}
