import java.util.Scanner;

public class BreakingRecords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int i=0; i < n; i++){
			s[i] = in.nextInt();

		}
		int flag=s[0];
		int k=0;
		int max = 0,min = 0;
		for(int i=0; i < n; i++){
			if (s[i]==flag)
			{
				k++;
			}
			if(k==n)
			{
				System.out.println(max+" "+min);
				System.exit(0);
			}

		}

		for(int i=0;i<1;i++)
		{

			if(s[0]>s[1])
			{
				max=s[0];
				min=s[1];
			}
			else
			{
				max=s[1];
				min=s[0];
			}
		}

		int count1=0;
		int count2=0;
		for(int i=0;i<1;i++)
		{
			if(max==min) {
				break;
			}
			else if(s[1]==max)
			{
				count1++;
			}
			else  if(s[1]==min)
			{
				count2++;
			}
		}
		for(int i=1;i<n;i++)
		{
			if(s[i]>max)
			{
				max=s[i];
				count1++;
			}
			else if(s[i]<min)
			{
				min=s[i];
				count2++;
			}


		}

		System.out.println(count1+"   "+count2);

	}

}
