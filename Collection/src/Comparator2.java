import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator2 {
	String name;
	int runs;
	float avg;
	public Comparator2(String name, int runs, float avg)
	{
		this.name=name;
		this.runs=runs;
		this.avg=avg;

	}
	public String getName()
	{
		return name;
	}
	public int runs()
	{
		return runs;
	}

	public float avg()
	{
		return avg;
	}
	public String toString()
	{
		return name+" "+runs+" "+avg;
	}

	public static void main(String[] args) {
		Comprtor c1=new Comprtor("sachin",99,75);
		Comprtor c2=new Comprtor("dhoni",90,65);
		Comprtor c3=new Comprtor("virat",80,59);
		ArrayList al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);	
		System.out.println(al);
		Collections.sort(al, new Comparator()
				{
			public int compare(Object x, Object y) {
				if(((Comprtor)(x)).runs>((Comprtor)(y)).runs )
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
				});
		System.out.println(al);
	}

}
