import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

    public class Main {
        public static void main(String[] args) {

            Student student1 = new Student("Giorgio", 21);
            Student student2 = new Student("Marco", 22);
            Student student3 = new Student("Carla", 23);
            Student student4 = new Student("Matteo", 24);
            Student student5 = new Student("Valerio", 21);
            Student student6 = new Student("Giancarlo", 21);
            Student student7 = new Student("Ginevra", 22);
            Student student8 = new Student("Alice", 23);
            Student student9 = new Student("Claudia", 24);
            Student student10 = new Student("Filippo", 21);
            Student student11 = new Student("Luca", 21);
            Student student12 = new Student("Miriam", 21);

            List<Student> listaStudenti = Arrays.asList(student1, student2, student3, student4,
                    student5, student6, student7, student8, student9, student10, student11, student12);
            System.out.println("Prima lista: \n" + listaStudenti);

            listaStudenti.sort(Comparator.comparing(Student::getName));
            System.out.println("Lista ordinata: \n" + listaStudenti);

        }
    }