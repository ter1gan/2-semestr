package Pr14;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество ячеек");
        int size = s.nextInt();
        Pr14 array = new Pr14(size);
        System.out.println("Все ячейки заполнены");
        while(true){
            System.out.println(Arrays.deepToString(array.array1()));

        }
    }

}
