import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Fruit frutto1 = new Fruit("mela");
        Fruit frutto2 = new Fruit("pesca");
        Fruit frutto3 = new Fruit("mango");
        LinkedList<Fruit> fruits = new LinkedList<>();
        fruits.add(frutto1);
        fruits.add(frutto2);
        fruits.add(frutto3);

        System.out.println(fruits);

        fruits.addFirst(new Fruit("banana"));
        fruits.addLast(new Fruit("melograno"));

        System.out.println(fruits);
    }
}