import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		TreeSet ts=new TreeSet();
		ts.add(100);
		ts.add(100);
		ts.add(125);
		ts.add(15);
		ts.add(50);
		ts.add(5);
		ts.add(175);
		ts.add(155);
		System.out.println(ts);
		/*for(int i=0;i<ts.size();i++)
		{
			System.out.print(ts.get(i)+" ");
		}*/
		System.out.println();

		for(Object x : ts)
		{
			System.out.print(x +" ");
		}
		System.out.println();
		
		Iterator itr= ts.iterator();
		while(itr.hasNext()==true)
		{
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		/* Stored in tree format so traditional for loop will not work*/

		
	}

}
