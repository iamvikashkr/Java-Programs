
public class Kuchbhi {

	public static void main(String[] args) {

		byte a=12;
		byte b=17;
		b+=a;
		System.out.println(b);
		b=(byte)(a+b);
		System.out.println(b);

		
		int c=55;
		long d=14;
		c=(int)(c+d);// explicit
		c+=d;//implicit type castiing
	}

}
