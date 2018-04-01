import java.util.Scanner;

public class Leaderboard {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("number of players");
		int n=scan.nextInt();
		int player[]=new int[n];
		int rank[]=new int[n];
		int count=1;
		for(int i=0;i<n;i++)
		{
		player[i]=scan.nextInt();
		if(i==0)
		{
			rank[i]=count;
		}
		
		else if(player[i]==player[i-1])
		{
			rank[i]=count;
		}
		else
		{
			count++;
			rank[i]=count;
		}
		}
		for(int j=0;j<n;j++) 
		{
			System.out.print(rank[j]+" -->");
			System.out.println(player[j]);
		}
		System.out.println("no of levels");
		int m=scan.nextInt();
		int scores[]=new int[m];
		
		for(int i=0;i<m;i++)
		{
			scores[i]=scan.nextInt();
		}
		
		
	}

}
