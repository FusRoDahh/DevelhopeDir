public class CostruttoIf_2 {
    public static void main(String[] args) {
        String text = "Hello World!";

        if (stringLength(text) > 10) {
            System.out.println("Lunghezza maggiore di 10!");
        } else if (stringLength(text) == 10) {
            System.out.println("Lunghezza pari a 10!");
        } else {
            System.out.println("Lunghezza minore di 10!");
        }
    }
    public static int stringLength(String x) {
        return x.length();
    }
}
