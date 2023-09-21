import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Prueba {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("¿Que mascota tienes?");
        String mascota = teclado1.nextLine();
        System.out.println("Que bien, ¿Qué nombre tiene?");
        String nombremascota = teclado1.nextLine();
        System.out.println("Entoncces tines un " + mascota + " y se llama " + nombremascota);

    }
}
