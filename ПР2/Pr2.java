import java.util.*;

public class Pr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для завершения введите значение отличное от 0 и 1");
        var n = in.nextInt();
        int i = 0;
        if (n < 2) {
            i++;
        }
        while (n < 2){
            n = in.nextInt();
            if (n == 1){
                i++;
            }

        }
        System.out.println("Количество работников: " + i);

    }

}
