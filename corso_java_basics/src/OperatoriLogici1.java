public class OperatoriLogici1 {
    public static void main(String[] args) {
        int higherNum = 145;
        int lowerNum = 73;
        int value = 97;

        System.out.println("Is " + value + " a number between " + lowerNum + " and " + higherNum + "?");
        System.out.println(comparison(higherNum, lowerNum, value));
    }

    public static boolean comparison(int majorNum, int minorNum, int num) {
        return majorNum >= num && minorNum <= num;
    }
}
