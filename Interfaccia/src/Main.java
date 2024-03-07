public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(5, 3);
        Rettangolo rettangolo = new Rettangolo(4, 2);

        System.out.println("L'area della forma è: " + triangolo.calcolaArea());
        System.out.println("L'area del rettangolo è: " + rettangolo.calcolaArea());

    }

}