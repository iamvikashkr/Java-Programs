import java.util.HashMap;
import java.util.Scanner;

public class Mapp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		HashMap hm= new HashMap();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			hm.put(name,phone);
			in.nextLine();
		}
		System.out.println(hm);
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(hm.get(s)!=null){
				System.out.println(s+"="+hm.get(s));
			}else{
				System.out.println("Not found");

			}
		}

	}
}
