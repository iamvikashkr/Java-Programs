import java.util.ArrayList;
import java.util.Collections;

public class Compable implements Comparable {


	String name;
	int runs;
	float avg;
	public Compable(String name, int runs, float avg)
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
		if(this.runs>((	Compable)(y)).runs)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}



	public static void main(String[] args) {
		Compable c1=new Compable("sachin",99,75);
		Compable c2=new Compable("dhoni",90,65);
		Compable c3=new Compable("virat",80,59);
		ArrayList al=new ArrayList();
		al.add(c1);
		al.add(c2);
		al.add(c3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
