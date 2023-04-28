import java.util.Scanner;

public class Pr11 {
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);
        String str1 = str.nextLine();
        String[] chars = new String[] {"а","е","я","ё","у","и","ю","э","ы","о"};
        for(int i = 0; i < chars.length; i++){
            str1 = str1.replace(chars[i],"");
        }
        System.out.println(str1);

    }

}
