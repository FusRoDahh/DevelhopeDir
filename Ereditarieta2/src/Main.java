public class Main {
    public static void main(String[] args) {
        Forma esagono = new Forma(6, 5, 3);
        Rettangolo rettangolo = new Rettangolo(4, 4, 2);

        System.out.println("L'area della forma è: " + esagono.calcolaArea());
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());

    }
}