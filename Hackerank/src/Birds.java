import java.util.Scanner;

public class Birds {

    
    static int migratoryBirds(int[] birds) {
        int[] count = new int[6];
        for (int num : birds) {
            count[num]++;
        }
        
        int maxIndex = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++){
            birds[i] = scan.nextInt();
        }
        scan.close();
        
        int result = migratoryBirds(birds);
        System.out.println(result);
    }


}
