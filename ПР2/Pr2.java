import java.util.*;

public class Pr2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для завершения введите значение отличное от 0 и 1");
        List<String> spisok = new ArrayList<String>();
        var n = in.nextInt();
        int i = 0;
        if (n < 2) {
            if(n==1){
                i++;
                spisok.add("true");
            } else {
                spisok.add("false");
            }

        }
        while (n < 2){
            n = in.nextInt();
            if (n == 1){
                i++;
                spisok.add("true");
            } else {
                spisok.add("false");

            }
        }
        int index = spisok.size() - 1;
        spisok.remove(index);
        System.out.println(spisok + "\n" + "Количество работников: " + i);

    }

}
