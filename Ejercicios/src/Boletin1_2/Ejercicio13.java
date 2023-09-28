package Boletin1_1;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu comida favorita");
        String comida = scan.nextLine();

        String a = switch (comida) {
            case "Hamburguesa":
                yield "Un gourmet";
            case "Pizza":
                yield "Que buena es italia";
            case "Ensalada":
                yield "¿Enserio tio?";
            default:
                yield "No es una de las opciones";
        };
        System.out.println(a);

    }
}
