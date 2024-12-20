import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declara o variabila numar ascuns de la 1 la 100
        // Cere de la user un numar de un infinit de ori
        // Daca numar < numarAscuns afiseaza "Mai mult"
        // Daca numar > numarAscuns afiseaza "Mai putin"
        // Daca numar == numarAscuns afiseaza "You guess" si opreste bucla

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int hiddenNumber = rnd.nextInt(100);
        int attemptNumber = 0;
        int maxAttempts = 10;

        while (true) {
            System.out.print("Input a number: ");
            int guessedNumber = sc.nextInt();
            attemptNumber++;
            maxAttempts--;

            if (maxAttempts == 0) {
                System.out.println("Gave over");
                break;
            }

            if (guessedNumber < hiddenNumber) {
                System.out.println("More");
            } else if (guessedNumber > hiddenNumber) {
                System.out.println("Less");
            } else {
                System.out.println("You guessed by " + attemptNumber + " attempts");
                break;
            }
        }
    }
}
