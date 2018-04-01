
public class StringApp {

	public static void main(String[] args) {

		String s1= new String("vikash");
		s1=s1.concat("kumar");
		System.out.println(s1);
		String s2="vikash";
		s2=s2.concat("kumar");
		System.out.println(s2);
		System.out.println("------------------------------");
		
		String a1=new String("you cannot change me");
		String a2=new String("you cannot change me");
		System.out.println(a1==a2);
		System.out.println(a1.equals(a2));
		String a3="you cannot change me";
		String a4="you cannot change me";
		System.out.println(a3==a4);
		System.out.println(a3.equals(a4));
		
		System.out.println(a1==a4);
		String a5="you cannot";
		String a6=a5+" change me";//goes into heap
		System.out.println(a6);
		System.out.println(a3==a6);
		System.out.println(a3.equals(a6));
		
		System.out.println("=============================");
		String b1="vikash";
		String b2=b1.toUpperCase();
		String b3=b1.toLowerCase();
		String b4=b2.toUpperCase();
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		System.out.println(b2==b4);
	}

}
