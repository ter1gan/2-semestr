import java.util.Scanner;

public class Pr44 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = sc.nextLine();
        String num2 = sc.nextLine();
        int num1_int = Integer.parseInt(num1);
        int num2_int = Integer.parseInt(num2);
        int summ = num1_int + num2_int;
        String summ_str = "" + summ;
        System.out.println(summ_str);

    }
}
