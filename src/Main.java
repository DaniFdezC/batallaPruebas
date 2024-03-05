import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vidaHeroe = 20;
        int vidaVampiro = 10;

        int ataqueHeroe = 2;
        int ataqueVampiro = 4;

        int probabilidadHeroe = 50;
        int probabilidadVampiro = 50;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (vidaHeroe > 0 && vidaVampiro > 0) {

            // Turno del heroe
            int probH = random.nextInt(100);

            if (probH < probabilidadHeroe) {
                System.out.println("El heroe ataca al vampiro y causa " + ataqueHeroe + " puntos de daño.");
                vidaVampiro -= ataqueHeroe;
            } else {
                System.out.println("El heroe intenta atacar al vampiro pero falla.");
            }

            if (vidaVampiro <= 0) {
                System.out.println("El heroe ha derrotado al vampiro. ¡Victoria del heroe!");
                break;
            }

            // Turno del vampiro
            int probV = random.nextInt(100);

            if (probV < probabilidadVampiro) {
                System.out.println("El vampiro ataca al heroe y causa " + ataqueVampiro + " puntos de daño.");
                vidaHeroe -= ataqueVampiro;
            } else {
                System.out.println("El vampiro intenta morder al heroe pero falla.");
            }

            if (vidaHeroe <= 0) {
                System.out.println("El vampiro ha derrotado al heroe. ¡Victoria del vampiro!");
                break;
            }

            System.out.println("Estado actual de la batalla:");
            System.out.println("Heroe HP: " + vidaHeroe);
            System.out.println("Vampiro HP: " + vidaVampiro);
            System.out.println();

            System.out.print("Presiona Enter para continuar...");
            scanner.nextLine();
        }

        scanner.close();
    }
}