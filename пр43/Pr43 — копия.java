
import static java.lang.Math.max;
import static java.util.Arrays.fill;

public class Pr43 {
    public static void main(String[] args) {
        int[] piramida =
                {5,
                        9, 6,
                        4, 6, 8,
                        0, 7, 1, 5,
                        123,1444,1,11,1
                        };

        System.out.println("Max. summ.: " + findingMaxSumm(piramida, 5));
    }

    public static int findingMaxSumm(int[] tree, int height) {
        int[] sums = new int[height + 1];
        fill(sums , 0);
        int element = height;
        int num = element - 1;
        int[] next_elements = new int[element];
        for(int i = tree.length - 1; i > -1 ; i--) {
            int left_max_path = sums[num];
            int right_max_path = sums[num + 1];
            next_elements[num] = max(right_max_path, left_max_path) + tree[i];
            num -= 1;
            if (num == -1) {
                element--;
                num = element - 1;
                sums = next_elements;
                next_elements = new int[sums.length - 1];
            }
        }
        return sums[0];
    }
}





