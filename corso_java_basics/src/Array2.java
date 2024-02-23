public class Array2 {
    public static void main(String[] args) {
        System.out.println("Il numero di occorrenze è: " + occ(array()));
    }

    public static char[] array() {
        char[] chars = new char[5];

        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'a';

        return chars;
    }

    public static int occ(char[] x) {
        int count = 0;

        for (char j : x) {
            if (j == 'a') {
                count++;
            }
        }

       return count;
    }
}
