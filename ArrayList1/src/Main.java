import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> listaStudenti = new ArrayList<>();
        listaStudenti.add(new Student("Valerio", 21));
        System.out.println(listaStudenti);

        Student student1 = new Student("Giorgio", 21);
        Student student2 = new Student("Marco", 22);
        Student student3 = new Student("Carla", 23);
        Student student4 = new Student("Matteo", 24);
        listaStudenti.add(student1);
        listaStudenti.add(student2);
        listaStudenti.add(student3);
        listaStudenti.add(student4);

        System.out.println(listaStudenti);


    }
}