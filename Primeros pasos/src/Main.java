import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Esta linea nos permite almacenar la entrada del teclado
        Scanner teclado = new Scanner(System.in);
        // Nos imprime por pantala la frase que querramos
        System.out.println("Hola, ¿cómo te llamas?");
        // Se declara la variable de nombre con el input que ponemos por teclado
        String nombre = teclado.nextLine();
        // Imprimimos por pantalla lo que queramos decir mas la varible que hemos establecido antes
        System.out.println("Hola " + nombre);
        System.out.println("¿Y de dónde eres?");
        // Creamos otra variable para la ciudad
        String ciudad = teclado.nextLine();
        System.out.println(ciudad + ", bonito sitio");

    }
}
