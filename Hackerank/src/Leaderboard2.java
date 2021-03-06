import java.util.Scanner;

public class Leaderboard2 {
public static void main(String[] args)
{

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int lastScore = -1;
    int[] scores = new int[n];
    int index = 0;
    while (n-- > 0) {
    	//System.out.println("dv");
        int currScore = scan.nextInt();
        if (currScore != lastScore) {
            scores[index] = currScore;
            index++;
        }
        lastScore = currScore;
    }
    for(int i=0;i<scores.length;i++)
    {
    	System.out.print(scores[i]+" ");
    }
    int m = scan.nextInt();
    int[] alice = new int[m];
    for (int i = 0; i < m; i++) {
        alice[i] = scan.nextInt();
    }
    scan.close();

    /* Print ranks */
    int i = index - 1;
    for (int aliceScore : alice) {
        while (i >= 0) {
            if (aliceScore < scores[i]) {
                System.out.println(i + 2); // add 2 to get correct rank
                break;
            }
            i--;
        }
        if (i < 0) { // if true, each remaining aliceScore is highest score
            System.out.println(1);
        }
    }

}
}
