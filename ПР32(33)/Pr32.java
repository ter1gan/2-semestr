import java.math.BigInteger;

public class Pr32 {
    public static void main(String[] args) {
        game(99);
    }
    public static void game(int n) {
        int Tanya = 0;
        while (n != 1) {
            if (n % 2 == 0) {
                Tanya++;
                n--;
                if (n == 1) {
                    break;
                } else {
                    n--;
                }

            } else {
                Tanya++;
                n--;
                if (n % 2 == 0) {
                    n /= 2;
                    if (n == 1) {
                        break;
                    }

                }
            }

        }
        System.out.println(Tanya);
    }
}
