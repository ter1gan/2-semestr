
import java.util.Scanner;

public class Pr39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(maxNum(num) > num){
            System.out.println(maxNum(num));
        } else {
            System.out.println(-1);
        }
    }
    public static int maxNum(int num){
        int[] arr = new int[10];
        String str = Integer.toString(num);
        for(int i= 0; i < str.length();i++){
            arr[str.charAt(i)-'0']++;

        }
        int max = 0;
        int composition = 1;
        for (int i = 0; i < 10; i++){
            while (arr[i] > 0) {
                max = max + (i * composition);
                arr[i]--;
                composition = composition * 10;
            }

        }
        return max;
    }

}
