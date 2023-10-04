package Boletin1_1Java;

import java.util.Scanner;

public class ejerccio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cant;
        int num;

        System.out.println("Escribe la cantidad de números que querias introducir");
        cant = scan.nextInt();

        while (cant < 0) {
            System.out.println("La cantidad debe ser positva");
            cant = scan.nextInt();
        }

    }
}
