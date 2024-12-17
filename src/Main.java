import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declara o variabila numar ascuns de la 1 la 100
        // Cere de la user un numar de un infinit de ori
        // Daca numar < numarAscuns afiseaza "Mai mult"
        // Daca numar > numarAscuns afiseaza "Mai putin"
        // Daca numar == numarAscuns afiseaza "You guess" si opreste bucla

        Scanner sc = new Scanner(System.in);
        int hiddenNumber = 75;

        while (true) {
            System.out.print("Input a number: ");
            int guessedNumber = sc.nextInt();

            if (guessedNumber < hiddenNumber) {
                System.out.println("More");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
            } else {
                System.out.println("You guessed");
                break;
            }
        }
    }
}
