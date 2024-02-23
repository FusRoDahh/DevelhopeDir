import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = i+ 1;
        }

        System.out.println(Arrays.toString(num));

        int result = 0;

        for (int j : num) {
            result += j;
        }

        System.out.println(result);
    }
}
