import java.util.Scanner;

public class Bdaycake {
	static int solve(int n, int[] s, int d, int m){
		int sum = 0;
        int numWays = 0;
        
        /* Test first set of "m" chocolates */
        for (int i = 0; i < m; i++) {
            sum += s[i];
        }
        if (sum == d) {
            numWays++;
        }
        
        /* Test remaining sets of "m" chocolates */
        for (int i = m; i < s.length; i++) {
            sum += s[i] - s[i-m]; // add chocolate, remove chocolate
            if (sum == d) {
                numWays++;
            }
        }
        
        return numWays;


	}

	public static void main(String[] args) {
		System.out.println(":;ldkj");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int s_i=0; s_i < n; s_i++){
			s[s_i] = in.nextInt();
		}
		int d = in.nextInt();
		int m = in.nextInt();
		int result=solve(n, s, d, m);
		System.out.println(result);
	}
}
