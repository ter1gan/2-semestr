import java.util.Arrays;
import java.util.Scanner;

public class Pr14 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите количество ячеек");
        int size = s.nextInt();
        int[][] array = cells(size);
        System.out.println("Все ячейки заполнены" + "\n" + Arrays.deepToString(array));
        array1(array);

    }
    public static int[][] cells(int size){
        Scanner s = new Scanner(System.in);
        System.out.println("Введите элементы ячеек");
        int[][] array = new int[size][3];
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < 3;j++){
                array[i][j] = s.nextInt();

            }
        }

        return array;

    }

    public static void array1(int[][] m){
        Scanner s = new Scanner(System.in);
        while(true){
            int number = s.nextInt();
            int min = Integer.MAX_VALUE;
            int minI = -1;
            int minJ = -1;
            for(int i = 0; i < m.length;i++){
                for(int j = 0; j < 3;j++){
                    if(m[i][j] < min){
                        min = m[i][j];
                        minI = i;
                        minJ = j;

                    }

                }

            }
            m[minI][minJ] = number;
            System.out.println(Arrays.deepToString(m));

        }



    }

}
