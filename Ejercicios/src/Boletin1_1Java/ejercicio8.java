package Boletin1_1Java;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num;
        double menor = Double.MAX_VALUE;


        do {
            System.out.println("¿Que número quieres introducir?");
            num = scan.nextInt();
            if (num < menor) {
                menor = num;
            }
            scan.nextLine();
            System.out.println("¿Quieres introducir alguno más?");
            String resp = scan.nextLine();

            if (!resp.equalsIgnoreCase("s")) {
                break;
            }

        } while (true);

        System.out.printf("El número menor que has introducido es " + menor);

    }
}
