public class CostruttoIf_1 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++) {
            System.out.println("Valore: " + i);
            System.out.println("Controllo: " + value(i));
        }
    }

    public static String value(int x) {
        String result = "";

        if ((x % 3 == 0) && (x % 5 == 0)) {
            result = "FizzBuzz";
        } else if (x % 3 == 0) {
            result = "Fizz";
        } else if (x % 5 == 0) {
            result = "Buzz";
        }

        return result;
    }
}
