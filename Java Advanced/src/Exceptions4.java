import java.util.Scanner;

public class Exceptions4 {
    public static void main(String[] args) {
        try{
            divideArrayByZero();
        } catch (ArithmeticException | IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Conti finiti, più o meno!");
        }
    }

    public static void divideArrayByZero(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Scrivi 3 numeri, premendo invio ogni volta, che saranno divisi per zero:");
            int[] nums = new int[3];
            for(int i = 0; i < 3; i++) {
                nums[i] = scanner.nextInt();
            }
            //chiedo l'array di numeri

            for (int i = 0; i < nums.length; i++) {
                int result = nums[i] / 0;
                System.out.println(result);
            }
            //provo a dividere per zero i numeri

        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Ti avevo detto 3 numeri... Sai contare?");
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Ehhh, sempre per zero divide, sempre inutile è 'sto programma");
        }
    }
}
