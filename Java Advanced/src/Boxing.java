public class Boxing {
    public static void main(String[] args) {
        int sommaInteri = somma(10, 20);
        System.out.println("Somma: " + sommaInteri);

        stampa('a');

        Integer sommaInteger = somma2(new Integer(10), new Integer(20));
        System.out.println("Somma di due Integer: " + sommaInteger);

        stampa2(new Character('a'));

        int num1 = 5;
        Integer num1Box = num1;
        double num2 = 5.2;
        Double num2Box = num2;
        char carattere = 'a';
        Character carBox = carattere;

        Integer numInt = new Integer(10);
        int numIntPrimitivo = numInt.intValue();
        Double numDouble = new Double(3.14);
        double numDoublePrimitivo = numDouble.doubleValue();
        Character carattereNuovo = new Character('a');
        char caratterePrimitivo = carattereNuovo.charValue();
        }

        static int somma(int a, int b) {
            return a + b;
        }

        static void stampa(char a) {
            System.out.println("Carattere: " + a);
        }

        static Integer somma2(Integer a, Integer b) {
            return a + b;
        }

        static void stampa2(Character c) {
            System.out.println("Carattere (oggetto): " + c);
        }
    }
