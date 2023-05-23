import java.util.Scanner;

public class Pr45 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ar_num = sc.nextInt();
        System.out.println(romanNumeral(ar_num));
    }
    public static String romanNumeral(int ar_num) {
        StringBuilder strBox = new StringBuilder();
        if(1 < ar_num && ar_num < 10000){
            int times;
            String[] romans_nums = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
                    "XC", "C", "CD", "D", "CM", "M" };
            int[] ar_ints = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500,
                    900, 1000 };
            for (int i = ar_ints.length - 1; i >= 0; i--) {
                times = ar_num / ar_ints[i];
                ar_num %= ar_ints[i];
                while (times > 0) {
                    strBox.append(romans_nums[i]);
                    times--;
                }
            }
            return strBox.toString();
        }
        return "";

    }
}
