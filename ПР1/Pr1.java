import java.util.Random;

public class Pr1 {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Random rnd = new Random();
        for (int i = 0; i < m.length; i++, System.out.println()) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = rnd.nextInt(10);
                System.out.print(m[i][j] + " ");

            }
        }
        System.out.println(" ");

        for (int i = 0; i < m.length; i++, System.out.println()) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[j][i] + " ");






            }
        }



    }

}




