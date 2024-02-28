public class Main {
    public static void main(String[] args) {

        Studente firstStudent = new Studente("Gianni", "Morandi", 6534);
        Studente secondStudent = new Studente("Gianni", "Morandi", 6534);

        secondStudent.setName("Pippo");
        secondStudent.setSurname("Franco");
        secondStudent.setId(2345);

        System.out.println("Nome studente: " + firstStudent.getName());
        System.out.println("Cognome studente: " + firstStudent.getSurname());
        System.out.println("Identificativo studente: " + firstStudent.getId());

        System.out.println("\nNome studente: " + secondStudent.getName());
        System.out.println("Cognome studente: " + secondStudent.getSurname());
        System.out.println("Identificativo studente: " + secondStudent.getId());
    }
}
