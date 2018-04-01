import java.util.*;

public class Arrlist {

	public static void main(String[] args) {

		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(50);
		//al.add("sachin");
		//al.add(3.12f);
		//al.add(true);
		al.add(10);
		System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
			System.out.print(al.get(i)+" ");
		}
		System.out.println();

		for(Object x : al)
		{
			System.out.print(x +" ");
		}
		System.out.println();
		Collections.sort(al);
		System.out.print(al);
		System.out.println();

		System.out.println("=========================================================================");
		
		PriorityQueue pq=new PriorityQueue<>();
		pq.add(100);
		pq.add(125);
		pq.add(15);
		pq.add(50);
		pq.add(5);
		pq.add(175);
		pq.add(155);
		System.out.println(pq);
		/*for(int i=0;i<pq.size();i++) 
		{
			System.out.println(pq.get(i));
		}*/
		
		for(Object x : pq)
		{
			System.out.print(x+ " ");
		}
		System.out.println();

		Iterator itr= pq.iterator();
		while(itr.hasNext()==true)
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		System.out.println("=========================================================================");


		
		
	}

}
