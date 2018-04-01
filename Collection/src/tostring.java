
public class tostring {
	String name;
	int age;
	tostring(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String getName()
	{
		return name;
	}
	public int age()
	{
		return age;
	}
	public String toString()
	{
		return name+" "+age;
	}
	

	public static void main(String[] args) {

	tostring s=new tostring("rama", 22);
	System.out.println(s.toString());
		String str=new String("rama");
		System.out.println(str.toString());
	}

}
