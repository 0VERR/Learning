import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[2];
        boolean error = true;

        do {
            try {
                System.out.println("Podaj 1 liczbe ");
                numbers[0] = input.nextInt();
                System.out.println("Podaj 2 liczbe ");
                numbers[1] = input.nextInt();
                input.nextInt();
                System.out.println("Ktora wartosc wyswietlic, 1 czy 2?");
                System.out.println("Liczba" + numbers[input.nextInt() - 1]);
                error = false;
            } catch (InputMismatchException ex) {
                System.out.println("Nie podales liczby calkowitej, jeszcze raz to rob");
            } catch (ArrayIndexOutOfBoundsException x) {
                System.out.println("Zbyt duza wartosc! Wybierz 1 lub 2.");
                input.nextInt();

            }

        } while (error);
            input.close();

    }
}
