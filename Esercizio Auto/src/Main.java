public class Main {
    public static void main(String[] args) {

        Auto firstCar = new Auto("Toyota", "Corolla");
        Auto secondCar = new Auto("Mazda", "Miata");

        System.out.println("Prima auto: " + firstCar.getMarca() + " - " + firstCar.getModello());
        System.out.println("Seconda auto: " + secondCar.getMarca() + " - " + secondCar.getModello());
    }
}