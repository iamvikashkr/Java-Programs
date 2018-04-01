import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Cricketer implements Comparable{
	String name;
	int runs;
	float avg;
	public Cricketer(String name, int runs, float avg)
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
	public int compareTo(Object y)
	{
		if(this.runs>((Cricketer)(y)).runs)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Cricketer c1=new Cricketer("sachin",99,75);
		Cricketer c2=new Cricketer("dhoni",90,65);
		Cricketer c3=new Cricketer("virat",80,59);
		TreeSet al=new TreeSet();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		//Collections.sort(al);
		//System.out.println(al);
	}
}
