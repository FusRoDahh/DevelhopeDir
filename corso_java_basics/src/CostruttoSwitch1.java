public class CostruttoSwitch1 {
    public static void main(String[] args) {
        int day = 4;

        System.out.println("Il giorno indicato è: " + dayOfWeek(day));
    }

        public static String dayOfWeek(int x) {
            String result;
            switch (x) {
                case 1 -> result = "Lunedì";
                case 2 -> result = "Martedì";
                case 3 -> result = "Mercoledì";
                case 4 -> result = "Giovedì";
                case 5 -> result = "Venerdì";
                case 6 -> result = "Sabato";
                case 7 -> result = "Domenica";
                default -> result = "Errore";
            }

            return result;
        }
}
